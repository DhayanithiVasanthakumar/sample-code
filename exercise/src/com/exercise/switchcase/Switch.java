package com.exercise.switchcase;


public class Switch {
	public static void switchCase(int n) {
		
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