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
		if(input == 'X' || input == 'O') {
			setLetter(input);
			return input;
		}
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
	
	/* UC3 -- Display the Board */
	public static void displayBoard(char[] board) {
		System.out.println("\n\t " + board[1] + " | " + board[2] + " | " + board[3] + "\n\t-----------");
		System.out.println("\t " + board[4] + " | " + board[5] + " | " + board[6] + "\n\t-----------");
		System.out.println("\t " + board[7] + " | " + board[8] + " | " + board[9] + "\n\t");
	}
	
	/* UC4 -- Player Movement */
	public static void move(char[] board, char playerLetter){
		System.out.println("Enter the index you want to move to: ");
		int index = sc.nextInt();
		while (index < 1 || index > 9) {
			System.out.println("Wrong Input. Try Again.");
			index = sc.nextInt();
		}
		if(board[index] == ' ') {
			board[index] = playerLetter;
		}
		else {
			System.out.println("Index not available. Choose another");
			move(board, playerLetter);
		}		
		return;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		char[] board = createBoard();
		char playerLetter = takeInput();
		displayBoard(board);
		move(board, playerLetter);
		
		sc.close();
	}
}
