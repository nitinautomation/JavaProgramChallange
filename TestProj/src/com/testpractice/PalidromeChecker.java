package com.testpractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PalidromeChecker {
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\GS-3287\\git\\TestAutomation\\TestProj\\PalidromeString.txt"))) {
			String line;
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\GS-3287\\git\\TestAutomation\\TestProj\\PalidromeStringfromFile.txt"));
			while ((line = br.readLine()) != null) {
				String[] sepr = line.split(" ");
				for (String str : sepr) {

					if (isPalindrome(str)) {
						System.out.println(str + " is a palindrome");						
						bw.write(str+"\n");
						bw.flush();
					} else {
						System.out.println(str + " is not a palindrome");
					}
				}


			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + e.getMessage());
		}
	}

	public static boolean isPalindrome(String str) {		
		String rev="";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev+str.charAt(i);
		}		
		return str.equalsIgnoreCase(rev);
	}
}
