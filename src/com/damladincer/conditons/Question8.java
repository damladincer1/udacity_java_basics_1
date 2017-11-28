package com.damladincer.conditons;

public class Question8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String schedule=null;
		int dayOfWeek=1;

		switch(dayOfWeek){
			case 1: 
				schedule="Gym in the morning.";
				break;
			case 2: 
				schedule="Class after work.";
				break;
			case 3: 
				schedule="Meetings all day";
				break;
			case 4: 
				schedule="Work from home.";
				break;
			case 5: 
				schedule="Game night after work.";
				break;
			default: 
				schedule="free";
		}
		System.out.println(schedule);
	}
}