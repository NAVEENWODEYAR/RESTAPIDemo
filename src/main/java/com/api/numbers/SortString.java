
package com.api.numbers;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @apiNote Given a list of strings, sort them according to increasing order of their length.
 */
public class SortString {

	static void sortString() {
        List<String> strList = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        strList.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("\n***************\n");
        strList.parallelStream().sorted(Comparator.comparing(String::length)).forEachOrdered(System.out::println);
        
	}
	
	public static void main(String[] args) {
		sortString();
	}

}
