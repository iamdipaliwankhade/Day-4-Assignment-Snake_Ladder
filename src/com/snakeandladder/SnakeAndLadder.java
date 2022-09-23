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
		int playerPosition = 0;
		System.out.println("Position of the player Before Game start : " + playerPosition);
		int dice = (int) (Math.floor((Math.random() * 6) + 1));
		System.out.println("Rolled Dice Number is " + dice);
	}
}