package com.yml.tictactoe;

import java.util.Scanner;

public class ChooseChar {

	public static void start() {
	System.out.println("Enter the input(X or O) ");
	Scanner sc = new Scanner(System.in);
	char c = sc.next().charAt(0);
	
	char computerChar;
	char playerChar;
	if(c == 'x')
		{
		computerChar='o';
		playerChar='x';
		}
	else
		{
		computerChar='x';
		playerChar='o';
		}
	}}

