package com.api.numbers.arrays;

import java.util.*;
import java.util.stream.Stream;

public class ArrProblems {
	static void mergeArrays() {
		Integer[] a = new Integer[] {4, 2, 7, 1,3,2,7,9};
        Integer[] b = new Integer[] {8, 3, 9, 5,1,4,2};
        
        Stream.concat(Arrays.stream(a),Arrays.stream(b)).sorted(Comparator.naturalOrder()).distinct().forEach(System.out::print);
        maxMinnumbers();
	}
	
	static void maxMinnumbers() {
		System.out.println("\n****Sorting***\n");
		List<Integer> intList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		intList.parallelStream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
		System.out.println("\nMax***\nMin");
		intList.stream().sorted().limit(3).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		System.out.println("\n*******\n");
		mergeArrays();
	}

}
