package com.chainsys.jfs3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class LoginForm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username;
		String email;
		String password;

		Pattern usernamePattern = Pattern.compile("^[a-zA-Z0-9_]{3,16}$");
		Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");

		do {
			System.out.print("Enter username (3-16 characters, letters, numbers, underscore only): ");
			username = scanner.nextLine();
		} while (!validateInput(username, usernamePattern));

		do {
			System.out.print("Enter email address: ");
			email = scanner.nextLine();
		} while (!validateInput(email, emailPattern));

		do {
			System.out.print(
					"Enter password (at least 8 characters, must have (uppercase, lowercase, number, and special character)): ");
			password = scanner.nextLine();
		} while (!validateInput(password, passwordPattern));

		System.out.println("Login successfully.");
	}

	private static boolean validateInput(String input, Pattern pattern) {
		Matcher matcher = pattern.matcher(input);
		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Invalid input. Please try again.");
			return false;
		}
	}
}
