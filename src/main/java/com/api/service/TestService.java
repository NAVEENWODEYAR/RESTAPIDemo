package com.api.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public String test(){
		return "**";
	}
	public int add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the int values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum "+(a+b));
		return a+b;
	}
}
