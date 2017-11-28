package com.damladincer.conditons;

public class Question3 {

	public static void main(String[] args) {
		boolean canSeePlayer=true;
		boolean playerPoweredUp=true;
		if(canSeePlayer){
			if(!(playerPoweredUp)){
				System.out.println("attack");
			}else{
				System.out.println("run away");
			}

		}else{
			System.out.println("wander");
		}
	}
}
