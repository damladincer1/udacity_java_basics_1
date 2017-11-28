package com.damladincer.functions;
/*
 * 1. Generate two random integers in the 1 to 6 range.
2. If the numbers are not the same, return the sum.
3. If the numbers are the same, generate two more random integers in the 1 to 6 range,
and return the sum of all 4 numbers.
 */
public class Question8 {
	
	public static int SIDE = 6;

	public static void main(String[] args) {
		 int finalResult = monopolyRoll();
		 System.out.println("your movement is: " +finalResult);
	}

	public static int monopolyRoll(){
	    int dice1 = roll(SIDE);
		System.out.println(dice1);
		int dice2 = roll(SIDE);
		System.out.println(dice2);
		
		if(dice1!=dice2){
			return dice1 + dice2;
		}else{
			int roll3 = roll(SIDE);
			System.out.println("Your dices is the same. Roll again");
			System.out.println(roll3);
			int roll4 = roll(SIDE);
			System.out.println(roll4);
			return dice1 + dice2 + roll3 + roll4;
		}
	}

	public static int roll(int side){
		double number = Math.random();

		double numberInt = number *side;

		int n = (int)numberInt + 1;
		
		return n;
	}
}