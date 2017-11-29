package com.damladincer.loops;

/**
 * Complete the factorial() function below. It should return the product of all the numbers
 * from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
 * 3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.
 * 
 * Starting code:
 * public int factorial(int n) {
 * 
 * }

 */

public class Question2 {
	
	public static final int ERROR_CODE=-999;

	public static void main(String[] args) {
		int result = factorial(5);
		if(result==ERROR_CODE) {
			System.out.println("Invalid number");
		} else {
			System.out.println(result);
		}
		
	}

	public static int factorial(int n) {
		if(n<0) {
			return ERROR_CODE;
		}
		int product=1;
		for (int i=0; i<=n; i++) {
			if(i!=0) {
				product = product * (i);
			} else {
				product=1;
			}
		}
		return product;
	}

}
