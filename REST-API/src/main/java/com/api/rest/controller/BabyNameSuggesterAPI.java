package com.api.rest.controller;

import okhttp3.*;
import org.json.*;

import java.io.IOException;
import java.util.Scanner;

public class BabyNameSuggesterAPI {

    private static final String OPENAI_API_KEY = "your-api-key-here";  // Replace this
    private static final String OPENAI_API_URL = "https://api.openai.com/v1/chat/completions";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (boy/girl): ");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter religion (Hindu/Muslim/Christian): ");
        String religion = scanner.nextLine().trim().toLowerCase();

        String prompt = "Suggest 10 modern baby names for a " + gender + " belonging to the " + religion + " religion. Only return the names as a numbered list.";

        String response = getAIResponse(prompt);
        System.out.println("\nSuggested Baby Names:\n" + response);

        scanner.close();
    }

    private static String getAIResponse(String prompt) throws IOException {
        OkHttpClient client = new OkHttpClient();

        JSONObject message = new JSONObject()
                .put("role", "user")
                .put("content", prompt);

        JSONArray messages = new JSONArray().put(message);

        JSONObject json = new JSONObject()
                .put("model", "gpt-3.5-turbo")
                .put("messages", messages)
                .put("temperature", 0.7);

        RequestBody body = RequestBody.create(
                json.toString(),
                MediaType.parse("application/json")
        );

        Request request = new Request.Builder()
                .url(OPENAI_API_URL)
                .header("Authorization", "Bearer " + OPENAI_API_KEY)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            String responseBody = response.body().string();
            JSONObject responseObject = new JSONObject(responseBody);
            JSONArray choices = responseObject.getJSONArray("choices");
            JSONObject choice = choices.getJSONObject(0);
            JSONObject messageObject = choice.getJSONObject("message");
            return messageObject.getString("content");
        }
    }
}
