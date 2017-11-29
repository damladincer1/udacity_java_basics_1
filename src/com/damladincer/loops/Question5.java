package com.damladincer.loops;

/*
 * 
 * Complete the Java function below to print out all the Strings in the String array parameter
 * in reverse order. (The String at the highest index should be printed first, then the String at
 * the next highest index, and so on. The String at index 0 should be printed last.)
 * 
 * For example, if a String array called weekdays had value
 * 
 * {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}
 * 
 * then this function call:
 * 
 * printInReverse(weekdays);
 * 
 * would print:
 * 
 * Friday
 * Thursday
 * Wednesday
 * Tuesday
 * Monday
 * 
 * 
 * Starting code:
 * public void printInReverse(String[] stringArray) {
 * 
 * }
 */
public class Question5 {

	public static void main(String[] args) {
		String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday"};
		printInReverse(days);
	}
 
	public static void printInReverse(String[] stringArray) {
		
		int lengthOfArray = stringArray.length;
		for(int i=lengthOfArray-1; i>=0; i--) {
			System.out.println(stringArray[i]);
		}
	}
}
	
