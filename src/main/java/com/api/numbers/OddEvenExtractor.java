package com.api.numbers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @apiNote, Collectors.groupingBy 
 */
public class OddEvenExtractor {

	static void seperateOddEvenNumbers(List<Integer> intList){
		List<Integer> intList1 = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        intList1.parallelStream().collect(Collectors.groupingBy(n -> n % 2 == 0)).entrySet().stream().map(entry -> String.format("--------------%n%s Numbers%n--------------%n%s", entry.getKey() ? "Even" : "Odd", entry.getValue().stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator())))).forEach(System.out::println);
	}
	public static void main(String[] args) {
		seperateOddEvenNumbers(Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5));
	}
}
