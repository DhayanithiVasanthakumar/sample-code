package com.exercise.checkvowels;

public class Vowel {
	public static void checkvowel(String str) {
		str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
	}
	
}
