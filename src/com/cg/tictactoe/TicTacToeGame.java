package com.cg.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static final int HEAD = 1, TAIL = 0;

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
		System.out.println("Enter the letter you wish to take: ('X' / 'O'): ");
		char input = Character.toUpperCase(sc.next().charAt(0));
		if (input == 'X' || input == 'O') {
			setLetter(input);
			return input;
		} else {
			System.out.println("Invalid Character. Try Again.");
			return takeInput();
		}
	}

	/* UC2 -- Determine letter for player and computer */
	public static void setLetter(char playerLetter) {
		computerLetter = (playerLetter == 'X') ? 'O' : 'X';
		System.out.println("Player Letter: " + playerLetter + "\nComputer Letter : " + computerLetter);
	}

	/* UC3 -- Display the Board */
	public static void displayBoard(char[] board) {
		System.out.println("\n\t " + board[1] + " | " + board[2] + " | " + board[3] + "\n\t-----------");
		System.out.println("\t " + board[4] + " | " + board[5] + " | " + board[6] + "\n\t-----------");
		System.out.println("\t " + board[7] + " | " + board[8] + " | " + board[9] + "\n\t");
	}

	/* UC4 -- Player Movement */
	/* UC5 -- Player places letter */
	public static void movePlayer(char[] board, char playerLetter) {
		System.out.println("Enter the index you want to move to: ");
		int index = sc.nextInt();
		while (index < 1 || index > 9) {
			System.out.println("Wrong Input. Try Again.");
			index = sc.nextInt();
		}
		if (board[index] == ' ') {
			board[index] = playerLetter;
			displayBoard(board);
		} else {
			System.out.println("Index not available. Choose another");
			movePlayer(board, playerLetter);
		}
		return;
	}

	/* UC6 -- Randomly decide who plays first */
	public static void firstMove(char[] board, char playerLetter) {
		int toss = (int) (Math.random() * 2 % 2);
		System.out.println(toss);
		if (toss == HEAD) {
			movePlayer(board, playerLetter);
			outcome(board);
		}

	}

	/* UC7 -- Winner, Tie or next turn */
	public static void outcome(char[] board) {
		if (checkRows(board)) {
		} else if (checkColumns(board)) {
		} else if (checkDiagonals(board)) {
		} else if (areMovesLeft(board)) {
		} else {
		}
	}

	private static boolean checkRows(char[] board) {
		if ((board[1] == board[2] && board[2] == board[3]) || (board[4] == board[5] && board[5] == board[6])
				|| (board[7] == board[8] && board[8] == board[9])) {
			return true;
		}
		return false;
	}

	private static boolean checkColumns(char[] board) {
		if ((board[1] == board[4] && board[4] == board[7]) || (board[2] == board[5] && board[5] == board[8])
				|| (board[3] == board[6] && board[6] == board[9])) {
			return true;
		}
		return false;
	}

	private static boolean checkDiagonals(char[] board) {
		if ((board[1] == board[5] && board[4] == board[9]) || (board[3] == board[5] && board[5] == board[7])) {
			return true;
		}
		return false;
	}

	private static boolean areMovesLeft(char[] board) {
		for (char pos : board) {
			if (pos == ' ')
				return (true);
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		char[] board = createBoard();
		char playerLetter = takeInput();
		displayBoard(board);
		// movePlayer(board, playerLetter);
		firstMove(board, playerLetter);

		sc.close();
	}
}
