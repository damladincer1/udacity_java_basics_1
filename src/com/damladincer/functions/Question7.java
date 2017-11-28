package com.damladincer.functions;

public class Question7 {

	public static void main(String[] args) {
		printTemperature(100);

	}
	/**
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public static double fahrenheitToCelcius(double fahrenheit){
		double celcius = (fahrenheit-32)*5/9;
		return celcius;
	}
	/**
	 * 
	 * @param fahrenheit
	 */
	public static void printTemperature(double fahrenheit){
		System.out.println("F: " +fahrenheit);
		System.out.println("C:" + fahrenheitToCelcius(fahrenheit));
	}

}
