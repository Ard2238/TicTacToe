package com.cg.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {	
	static Scanner sc = new Scanner(System.in);
	static char playerLetter, computerLetter;
	
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
		System.out.println("Enter the input ('X' / 'O'): ");
		char input = Character.toUpperCase(sc.next().charAt(0));		
		if(input == 'X' || input == 'O')
			return input;
		else {
			System.out.println("Invalid Character. Try Again.");
			return takeInput();
		}
	}
	
	/* UC2 -- Determine letter for player and computer */
	public static void setLetter(char playerLetter) {
		computerLetter = (playerLetter == 'X')? 'O':'X';			
		System.out.println("Player Letter: " + playerLetter + "\nComputer Letter : " + computerLetter);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		char[] board = createBoard();
		char playerLetter = takeInput();	
		setLetter(playerLetter);
		
		sc.close();
	}
}
