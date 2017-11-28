package com.damladincer.functions;

/*
Write a Java function called absoluteValue(). The access modifier should be public, it
should have a return type of double, and it should take one double parameter as input. If
the double parameter is less than 0, it should return that number negated. Otherwise, it
should return the parameter unchanged
 */
public class Question4 {

	public static void main(String[] args) {
		double a=absoluteValue(-35.4);
		System.out.println(a);
		double b=abs(-5);
		System.out.println(b);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static double absoluteValue(double n){
		if(n<0){
			return n*-1;
		}else {
			return n;
		}
	}	

	public static double abs(double number){
		return Math.abs(number);
	}

}


