package com.api.numbers;

import java.util.*;

public class SortDecimals {
	static void sortdecimals(List<Double> list) {
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;
	}
	public static void main(String[] args) {
	
		sortdecimals(Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12));
	}
}
