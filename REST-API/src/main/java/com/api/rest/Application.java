package com.api.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
	}
    @Bean
    public CommandLineRunner printJavaVersion() {
        return args -> {
            String javaVersion = System.getProperty("java.version");
            System.out.println("\n#############################\n");
            System.out.println("JAVA VERSiON: " + javaVersion);
            System.out.println("\n#############################\n");
        };
    }
}
