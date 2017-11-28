package com.damladincer.functions;

public class Question6 {

	public static void main(String[] args) {
		String message=nametagText("Emre");
		System.out.println(message);

	}

	public static String nametagText(String name){
		String nametag = "Hello, my name is " + name;
		return nametag;
	}

}
