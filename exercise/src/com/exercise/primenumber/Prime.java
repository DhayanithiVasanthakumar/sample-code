package com.exercise.primenumber;

public class Prime {
	public static void checkPrime(int n) {
		
		boolean checkPrime=true;
		
		if(n<=1) {
			checkPrime=false;
		}else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				checkPrime=false;
				break;
			}
		}
		System.out.println(checkPrime?n+"Number is prime":n+"Number is not prime");

		}
	}
}
