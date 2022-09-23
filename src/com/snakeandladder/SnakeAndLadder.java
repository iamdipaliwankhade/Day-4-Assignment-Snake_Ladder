package com.snakeandladder;

/**
 * 
 * @author Dipali
 *
 */
public class SnakeAndLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake Ladder Program");
		System.out.println("*******************************\n");
		int playerPosition = 0;
		System.out.println("Position of the player Before Game start : " + playerPosition);
		int dice = (int) (Math.floor((Math.random() * 6) + 1));
		System.out.println("Rolled Dice Number is " + dice);

		int chance = (int) Math.floor(Math.random() * 3);
		if (chance == 0) {
			System.out.println("No Play");
			playerPosition = playerPosition;
			System.out.println("player Position after roll is " + playerPosition);
		} else if (chance == 1) {
			System.out.println("Got a Ladder");
			playerPosition = playerPosition + dice;
			System.out.println("player Position after roll is " + playerPosition);
		} else {
			System.out.println("Hit with a Snake");
			playerPosition = playerPosition - dice;
			if (playerPosition < 0) {
				playerPosition = 0;
			}
			System.out.println("player Position after roll is" + playerPosition);
		}
	}

}