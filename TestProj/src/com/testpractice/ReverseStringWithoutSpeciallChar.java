package com.testpractice;

import java.util.Scanner;

public class ReverseStringWithoutSpeciallChar {

	public static void main(String[] args) {

		System.out.println("Please Enter a String");
		Scanner sc = new Scanner(System.in);

		reverseStringWithoutSpecialChar(sc.nextLine());
	}

	private static void reverseStringWithoutSpecialChar(String inputString) {

		char[] charArray = inputString.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {

			if (!Character.isLetterOrDigit(charArray[left])) {
				left++;
			}
			if (!Character.isLetterOrDigit(charArray[right])) {
				right--;
			} else {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;

			}

		}
		System.out.println(charArray);

	}

}
