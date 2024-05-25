
package com.api.numbers;

import java.util.stream.*;

/**
 * @autor Navee K Wodeyar
 * @date 25/05/2024
 * Find sum of all digits of a number in Java8
 */
public class SumOfDigits {

	static Integer sumOfDigits(Integer num) {
		return Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));
	}
}
