package com.cg.tictactoe;

public class TicTacToeGame {	
	
	//Creating a Board
	public static char[] createBoard() {		
		char[] board =  new char[10];		
		for(int i=0; i<10; i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	public static void main(String[] args) {		
		System.out.println("Welcome to the TicTacToe Game");		
		char[] board = createBoard();
	}
}
