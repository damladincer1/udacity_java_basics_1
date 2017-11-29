package com.damladincer.loops;
/*
 * A savings account yields 5% interest annually. This Java function is designed to determine
how many years it will take for you to have $1,000,000 on deposit given an initial value. The
parameter represents the initial deposit, and the function should return an integer number
of years before there will be $1,000,000 or more in the account. Write a loop to determine
the number of years, and return that value.
(Hint: Do we know how many times this loop needs to iterate? Does this mean a for loop
or a while loop is more appropriate?)
Starting code:
public int yearsTilOneMillion(double initialBalance) {
return 0;
}
 */
public class Question4 {

	public static void main(String[] args) {
		int years = yearsTilOneMillion(750000);
		System.out.println(years);
	}
	
	public static int yearsTilOneMillion(double initialBalance) {
		int years = 0;
		while (initialBalance < 1000000) {
			years++;
			initialBalance += initialBalance * 5 / 100;
		}
		return years;
	}
}