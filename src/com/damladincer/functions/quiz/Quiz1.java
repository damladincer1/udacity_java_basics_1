package com.damladincer.functions.quiz;

//obeb - okek
public class Quiz1 {

	public static void main(String[] args) {
		int number1 = 14;
		int number2 = 7;
		
		int obeb = obeb(number1, number2);
		System.out.println("OBEB: " + obeb);
		int okek = okek(number1, number2);
		System.out.println("OKEK: " + okek);

	}

	public static int obeb(int number1, int number2) {
		int obeb = 1;
		int smallerNumber;
		if (number1 <= number2) {
			smallerNumber = number1;
		} else {
			smallerNumber = number2;
		}
		if (number1 % number2 == 0) {
			obeb = number2;
		} else if (number2 % number1 == 0) {
			obeb = number1;
		} else {
			for (int i = 2; i <= smallerNumber / 2; i++) {
				if (number1 % i == 0 && number2 % i == 0) {
					obeb = i;
				}
			}
		}
		return obeb;
	}

	public static int okek(int number1, int number2) {
		int okek = 1;
		if (number1 % number2 == 0) {
			okek = number1;
		} else if (number2 % number1 == 0) {
			okek = number2;
		} else {
			okek = number1 * number2 / obeb(number1, number2);
		}
		return okek;
	}
}