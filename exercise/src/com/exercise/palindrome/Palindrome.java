package com.exercise.palindrome;

public class Palindrome {
	public static void palindrome(String str) {
		String reverse=new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse.equalsIgnoreCase(str)?"String is Palindrome":"String is not Palindrome");
	}

}
