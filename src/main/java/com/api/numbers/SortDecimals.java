package com.api.numbers;

import java.util.*;
import java.util.stream.Collectors;

public class SortDecimals {
	static void sortdecimals(List<Double> list) {
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println("\n*********\n");
		joinString();
	}
	
	static void joinString() {
     List<String> strList = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
     String str = strList.parallelStream().collect(Collectors.joining("[", "]", ","));
     System.out.println(str);
     System.out.println("\n******\n");
     filterNumbers();
	}
	
	static void filterNumbers() {
        List<Integer> intList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        intList.parallelStream().filter(n-> n/5 == 0).collect(Collectors.toList()).forEach(System.out::print);
        
	}
	public static void main(String[] args) {
	
		sortdecimals(Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12));
		
		
	}
}
