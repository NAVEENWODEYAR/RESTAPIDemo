package com.api.numbers.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrProblems {
	static void mergeArrays() {
		Integer[] a = new Integer[] {4, 2, 7, 1};
        Integer[] b = new Integer[] {8, 3, 9, 5};
        
        Stream.concat(Arrays.stream(a),Arrays.stream(b)).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
   
	}

	public static void main(String[] args) {
		System.out.println("\n*******\n");
		mergeArrays();
	}

}
