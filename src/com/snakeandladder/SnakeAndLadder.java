package com.snakeandladder;

/**
 * 
 * @author Dipali
 *
 */
public class SnakeAndLadder {
	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snake Ladder Program");
		System.out.println("*******************************\n");
		int playerPosition = 0;
		int i = 0;
		System.out.println("Position of the player Before Game start : " + playerPosition);
		while (playerPosition != WINNING_POSITION) {
			System.out.println("\nRoll Dice to Move");
			System.out.println("*****************");
			int dice = (int) (Math.floor((Math.random() * 6) + 1));
			System.out.println("The Dice is : " + dice);
			int chance = (int) Math.floor(Math.random() * 3);
			if (chance == 0) {
				System.out.println("No Play");
				playerPosition = playerPosition;
				i++;
			} else if (chance == 1) {
				System.out.println("Got a Ladder");
				if (playerPosition < WINNING_POSITION) {
					playerPosition = playerPosition + dice;
					i++;
					if (playerPosition > WINNING_POSITION) {
						System.out.println("position getting more than 100");
						playerPosition = playerPosition - dice;
					}
				} else {
					playerPosition = playerPosition;
					i++;
				}
			} else {
				System.out.println("Hit with a Snake");
				playerPosition = playerPosition - dice;
				i++;
				if (playerPosition < 0) {
					playerPosition = 0;

				}
			}
			System.out.println("player present Position is " + playerPosition);
			System.out.println("Moves : " + i);
		}
	}

}