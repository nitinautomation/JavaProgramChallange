package com.testpractice;

import java.util.Scanner;

public class ReverseStringWithoutSplChar {

	public static void main(String[] args) {

		System.out.println("Please Enter a String");
		Scanner sc = new Scanner(System.in);

		reverseStringWithoutSpecialChar(sc.nextLine());
	}

	private static void reverseStringWithoutSpecialChar(String inputString) {

		char[] charArr = inputString.toCharArray();
		int left = 0;
		int right = charArr.length - 1;
		while (left < right) {

			if (!Character.isLetterOrDigit(charArr[left])) {
				left++;
			}
			if (!Character.isLetterOrDigit(charArr[right])) {
				right--;
			} else {
				char temp = charArr[left];
				charArr[left] = charArr[right];
				charArr[right] = temp;
				left++;
				right--;

			}

		}
		System.out.println(charArr);

	}

}
