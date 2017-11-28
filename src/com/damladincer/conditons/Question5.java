package com.damladincer.conditons;

public class Question5 {

	public static void main(String[] args) {
		double time=13.00;
		String timeOfDay=null;
		if ( time >=5 && time < 12){
			timeOfDay="morning";
		} else if ( time >= 12 && time < 20){
			timeOfDay="daytime";
		} else {
			timeOfDay="night";
		}
		System.out.println("time of the day:"+timeOfDay);
	}
}
