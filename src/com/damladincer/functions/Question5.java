package com.damladincer.functions;

public class Question5 {
	public static void main(String[] args) {
		double number = calculateTip(100);
		System.out.println(number);
	}

	public static double calculateTip(double costOfMeal){
			return costOfMeal/100*15;
	}
}
