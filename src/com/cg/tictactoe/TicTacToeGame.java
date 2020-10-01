package com.cg.tictactoe;

public class TicTacToeGame {
	
	
	public static void createBoard() {
		
		char[] board =  new char[10];
		
		for(int i=0; i<10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the TicTacToe Game");
		
		createBoard();

	}

}
