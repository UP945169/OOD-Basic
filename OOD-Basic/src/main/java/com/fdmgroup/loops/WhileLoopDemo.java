package com.fdmgroup.loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		String password = "";
		Scanner input = new Scanner(System.in);


		while (password.length() < 12){
			System.out.println("Enter a password of at least 12 characters: ");
			password = input.nextLine();
		}

		System.out.println("Your new password is: " + password);
	}

}
