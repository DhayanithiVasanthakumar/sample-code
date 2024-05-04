package com.exercise.enumswitch;

public class Switch {
	public static void switchCase(Grade result) {
	
		switch (result) {
		case Top:
			System.out.println("A");
			break;
		case Average:
			System.out.println("B");
			break;
			default:
				System.out.println("invalid");
				break;
		}
	}

}
