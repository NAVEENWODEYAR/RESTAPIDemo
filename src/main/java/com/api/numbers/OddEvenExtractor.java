package com.api.numbers;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 */
public class OddEvenExtractor {

	static void seperateOddEvenNumbers(List<Integer> intList){
		intList.parallelStream().collect(Collectors.groupingBy(n-> n%2 ==0)).entrySet().forEach(System.out::println);
	}
	public static void main(String[] args) {
		seperateOddEvenNumbers(Arrays.asList(1,2,3,4,5,6,7,8,9,2,3,4,5));
	}
}
