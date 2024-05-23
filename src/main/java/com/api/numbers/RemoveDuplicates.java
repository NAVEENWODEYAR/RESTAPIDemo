package com.api.numbers;

import java.util.*;

import jakarta.validation.constraints.AssertTrue.List;

/**
 * 
 */
public class RemoveDuplicates {
	
	static void removeDuplicates(java.util.List<String> list) {
		list.stream().distinct().forEach(System.out::println);
	}

	public static void main(String[] args) {
		removeDuplicates(Arrays.asList("A","D","F","B","O","A","R"));
	}
}
