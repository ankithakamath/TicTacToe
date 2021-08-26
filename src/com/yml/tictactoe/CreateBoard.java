package com.yml.tictactoe;

public class CreateBoard {

	private char[] board = new char[10];

	public void start() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';

		}
	}
}