package com.damladincer.loops;

/*
 * Complete the function below, which finds the range covered by an integer array. Inside
 * the function, find the smallest value in the parameter array, and find the largest value, and
 * return the largest value minus the smallest value. If the array has length 0, return -1.
 * 
 * For example, if the variable myIntArray had the value
 * 
 * {1, 0, 2, 3, -1, 2}
 * 
 * then the function call
 * 
 * findRange(myIntArray)
 * 
 * would return 4. The largest value in the array is 3, the smallest value is -1, and 3−(−1) = 4.
 * 
 * Starting code:
 * public int findRange(int[] intArray) {
 *    return -1;
 * }
 */
public class Question6 {

	public static void main(String[] args) {
		int[] myIntArray = { 1, 0, 2, 3, -4, -2 };
		int max = findRange(myIntArray);
		System.out.println("The difference between max and min: "+max);
	}

	public static int findRange(int[] intArray) {
		int lengthOfArray = intArray.length;
		int max;
		int min;
		if (lengthOfArray == 0) {
			return -1;
		} else {
			min = intArray[0];
			max = intArray[0];
			for (int i = 0; i < lengthOfArray; i++) {
				if (intArray[i] > max) {
					max = intArray[i];
				}
				if(intArray[i]<min) {
					min=intArray[i];
				}
			}
		}
		return max-min;
	}
}