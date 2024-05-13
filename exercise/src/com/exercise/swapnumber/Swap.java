package com.exercise.swapnumber;

public class Swap {
	public static void swap(int a,int b) {
		System.out.println("Before Swap"); 
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("After Swap");
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
	}

}
