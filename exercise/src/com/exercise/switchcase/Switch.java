package com.exercise.switchcase;
import java.util.Scanner;

public class Switch {
	public static void switchCase(int n) {
		
		System.out.println("Enter Grade");
		String grade;
	
		switch (n) {
		case 90:
			grade="A";
			break;
		case 80:
			grade="B";
			break;
		case 70:
			grade="C";
			break;
			default:
				grade="invalid";
				break;
		}
		System.out.println(grade);
	}
}