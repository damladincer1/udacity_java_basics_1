package com.damladincer.conditons;

public class Question4 {

	public static void main(String[] args) {
		boolean isSnowing=true;
		boolean isRaining=true;
		double temperature=60.0;
		if(isSnowing || isRaining || (temperature<50)){
			System.out.println("Let's stay home");
		}else{
			System.out.println("Let's go out!");
		}

	}

}
