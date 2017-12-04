package com.damladincer.functions.quiz;

import java.lang.Character;

public class Quiz2 {

	public static void main(String[] args) {
		boolean result;
		String s1 = "TR33 0006 1005 1678 6457 8413 23";
		result = isIBANValid(s1);
		if (result == true) {
			System.out.println("IBAN is valid");
		} else {
			System.out.println("IBAN is invalid");
		}
	}

	public static boolean isIBANValid(String iban) {
		boolean result = false;
		iban = iban.replaceAll("\\s", "");
		String alphan = iban.substring(0, 2);
		String numeric = iban.substring(2);

		if (iban.length() > 34) {
			return false;
		} else if (Character.isLetter(alphan.charAt(0)) && Character.isLetter(alphan.charAt(1))) {
			for (int i = 2; i < numeric.length(); i++) {
				if (Character.isDigit(numeric.charAt(i))) {
					result = true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}

		return result;
	}

}
