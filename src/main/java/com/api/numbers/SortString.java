
package com.api.numbers;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @apiNote Given a list of strings, sort them according to increasing order of their length.
 */
public class SortString {

	static void sortString() {
        List<String> strList = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        Object[] array = strList.parallelStream().sorted(Comparator.reverseOrder()).toArray();
        System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		sortString();
	}

}
