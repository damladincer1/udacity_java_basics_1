package com.damladincer.loops;

/**
 * Let’s improve the monopolyRoll() function from the previous problem set.
 * Recall that in Monopoly, players roll two six-sided dice to determine their
 * move. If the same value is on both dice, this is called “rolling doubles,”
 * and it means they go again. In the last problem set, you wrote a function
 * that rolled two six-sided dice and, if the values on both die were the same,
 * rolled two more and returned the sum. This time, write a function that does
 * the same except it continues rolling until two non-equal values appear on the
 * two dice. In other words, the function should behave as follows:
 * 
 * 1. Generate two random numbers in the 1 to 6 range.
 * 
 * 2. If they are not the same, return the sum of all numbers rolled so far.
 * 
 * 3. If they are the same, keep track of the total rolled so far and return to
 * step 1.
 * 
 * Think about what kind of loop you want to define to repeat these steps.
 * Again, you may want to define a separate function for generating dice rolls.
 * 
 * Optional challenge: in Monopoly, if a player rolls doubles three times in a
 * row, they go to “jail.” Modify your function to keep track of the number of
 * rolls made so far. If three consecutive doubles are rolled, return -1 instead
 * of continuing to roll.
 * 
 * Optional challenge 2: in the last lesson, you learned about while loops and
 * for loops as a way to make a computer program repeat. There is another method
 * for making a program repeat using only functions called recursion. A
 * “recursive” function is one which calls itself inside itself. See if you can
 * write the monopolyRoll() function by calling monopolyRoll() inside the
 * function itself to handle the case where further rolls are made.
 * 
 * You can get an overview of recursion in Java here:
 * <a href="https://howtoprogramwithjava.com/java-recursion/">Java Recursion</a>
 */
public class Question8 {

	private static final int RANGE = 6;
	private static final int JAIL_ROLL_COUNT = 3;
	private static final int JAIL = -1;

	public static void main(String[] args) {
		int move = monopolyRoll(RANGE);
		if (move == JAIL) {
			System.out.println("Go to the jail!");
		} else {
			System.out.println("Your total move: " + move);
		}
	}

	public static int monopolyRoll(int range) {
		int dice1 = 0;
		int dice2 = 0;
		int total = 0;
		int rollCount = 0;
		while (dice1 == dice2) {
			dice1 = rollDice(RANGE);
			System.out.println(dice1);
			dice2 = rollDice(RANGE);
			System.out.println(dice2);
			rollCount++;
			total += dice1 + dice2;
			if (rollCount == JAIL_ROLL_COUNT && dice1 == dice2) {
				return -1;
			}
		}
		return total;
	}
	
	public static int monopolyRollRecursive(int range) {
		int dice1 = rollDice(range);
		System.out.println(dice1);
		int dice2 = rollDice(range);
		System.out.println(dice2);
		int totalMove = dice1 + dice2;
		if (dice1 == dice2) {
			return totalMove + monopolyRollRecursive(range);
		} else {
			return totalMove;
		}
	}

	public static int rollDice(int range) {
		double dice = Math.random();
		dice = dice * range;
		dice += 1;

		int dice1 = (int) dice;

		return dice1;
	}
}