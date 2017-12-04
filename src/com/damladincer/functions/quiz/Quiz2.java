package com.damladincer.functions.quiz;

import java.lang.Character;

public class Quiz2 {

	public static void main(String[] args) {
		boolean result;
		String s1 = "TR3t0006100516786477841323";
		result = isIBANValid(s1);
		if (result == true) {
			System.out.println("IBAN is valid");
		} else {
			System.out.println("IBAN is invalid");
		}
	}

	public static boolean isIBANValid(String iban) {
		boolean result = true;
		iban = iban.replaceAll(" ", "");
		String alphan = iban.substring(0, 2);
		String numeric = iban.substring(2);

		if (iban.length() > 34) {
			result = false;
		} else if (Character.isLetter(alphan.charAt(0)) && Character.isLetter(alphan.charAt(1))) {
			for (int i = 0; i < numeric.length(); i++) {
				if (!Character.isDigit(numeric.charAt(i))) {
					result = false;
					break;
				}
			}
		} else {
			result=false;
		}

		return result;
	}

}
