package com.chainsys.jfs3;

public class HighScore {

	public static void main(String[] args) {

		int score1 = 1500;
		int score2 = 900;
		int score3 = 400;
		int score4 = 50;

		displayHighScorePosition("Player 1", score1);
		displayHighScorePosition("Player 2", score2);
		displayHighScorePosition("Player 3", score3);
		displayHighScorePosition("Player 4", score4);
	}

	public static void displayHighScorePosition(String playerName, int playerScore) {
		int position = calculateHighScorePosition(playerScore);
		if (position != -1) {
			System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
		} else {
			System.out.println("Invalid score for " + playerName + ". Score must be a positive integer.");
		}
	}

	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 0) {
			if (playerScore >= 1000) {
				return 1;
			} else if (playerScore >= 500) {
				return 2;
			} else if (playerScore >= 100) {
				return 3;
			} else {
				return 4;
			}
		} else {
			return -1;
		}
	}

}
