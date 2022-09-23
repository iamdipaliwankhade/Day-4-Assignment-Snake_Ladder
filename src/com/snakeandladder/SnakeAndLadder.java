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
		System.out.println("Position of the player Before Game start : " + playerPosition);
		while (playerPosition != WINNING_POSITION) {
			System.out.println("Roll Dice to Move");
			int dice = (int) (Math.floor((Math.random() * 6) + 1));
			int chance = (int) Math.floor(Math.random() * 3);
			if (chance == 0) {
				System.out.println("No Play");
				playerPosition = playerPosition;
			} else if (chance == 1) {
				System.out.println("Got a Ladder");
				if (playerPosition < WINNING_POSITION) {
					playerPosition = playerPosition + dice;
				} else {
					playerPosition = playerPosition;
				}
			} else {
				System.out.println("Hit with a Snake");
				playerPosition = playerPosition - dice;
				if (playerPosition < 0) {
					playerPosition = 0;
				}
			}
			System.out.println("player present Position is " + playerPosition);
		}
	}
}