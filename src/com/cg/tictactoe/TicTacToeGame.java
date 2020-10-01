package com.cg.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {	
	static Scanner sc = new Scanner(System.in);
	
	/* UC1 -- Creating a Board */	 
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int pos = 1; pos < board.length; pos++) {
			board[pos] = ' ';
		}
		return board;
	}
	
	/* UC2 -- Taking Input */ 
	public static char takeInput() {
		System.out.println("Enter the input: ");
		char input = sc.next().charAt(0);		
		return input;		
	}
	
	/* UC2 -- Deciding which player will proceed to play */
	public static String decidePlayer() {
		String player;
		int temp = (int) (Math.random()*2 % 2);
		if(temp == 0) {
			player = "Player";
		}else {
			player = "Computer";
		}
		return player;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		char[] board = createBoard();
		char input = takeInput();
		String player = decidePlayer();
		
		System.out.println(player + " will begin now with " + input);
	}
}
