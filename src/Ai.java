import java.util.*;

import javax.swing.JOptionPane;

public class Ai {

	List<int[]> availableMoves = new ArrayList<>();
	List<int[]> usedMoves = new ArrayList<>();

	public boolean[][] aiPressed = new boolean[3][3];

	public Ai(boolean[][] pressed) {
		this.aiPressed = pressed;
	}

	public Ai() {

	}

	/**
	 * Checks if the user won
	 * @return returns a true boolean on win
	 */
	public static boolean checkWinPlayer() {
		boolean win = false;

		boolean[][] pressed = Brett.getPressed();

		if (pressed[0][0] && pressed[0][1] && pressed[0][2]) {
			win = true;
		} else if (pressed[1][0] && pressed[1][1] && pressed[1][2]) {
			win = true;
		} else if (pressed[2][0] && pressed[2][1] && pressed[2][2]) {
			win = true;
		} else if (pressed[0][0] && pressed[1][0] && pressed[2][0]) {
			win = true;
		} else if (pressed[0][1] && pressed[1][1] && pressed[2][1]) {
			win = true;
		} else if (pressed[0][2] && pressed[1][2] && pressed[2][2]) {
			win = true;
		} else if (pressed[0][0] && pressed[1][1] && pressed[2][2]) {
			win = true;
		} else if (pressed[2][0] && pressed[1][1] && pressed[0][2]) {
			win = true;
		}

		return win;

	}

	/**
	 * Checks if the AI won
	 * @return returns a true boolean on win
	 */
	public static boolean checkWinAi() {
		boolean win = false;

		boolean[][] pressed = Brett.getPressedAi();

		if (pressed[0][0] && pressed[0][1] && pressed[0][2]) {
			win = true;
		} else if (pressed[1][0] && pressed[1][1] && pressed[1][2]) {
			win = true;
		} else if (pressed[2][0] && pressed[2][1] && pressed[2][2]) {
			win = true;
		} else if (pressed[0][0] && pressed[1][0] && pressed[2][0]) {
			win = true;
		} else if (pressed[0][1] && pressed[1][1] && pressed[2][1]) {
			win = true;
		} else if (pressed[0][2] && pressed[1][2] && pressed[2][2]) {
			win = true;
		} else if (pressed[0][0] && pressed[1][1] && pressed[2][2]) {
			win = true;
		} else if (pressed[2][0] && pressed[1][1] && pressed[0][2]) {
			win = true;
		}

		return win;

	}

	/**
	 * Sets a button to pressed
	 * @param zeile the column which should be pressed
	 * @param reihe the row which should be pressed
	 */
	public void setPressed(int zeile, int reihe) {
		aiPressed[zeile][reihe] = true;
		Brett.pressedAi[zeile][reihe] = true;
	}

	/**
	 * Checks all fields if they have been already pressed
	 * @return List with all fields which haven't been selected
	 */
	public List<int[]> getAvailableMoves() {
		availableMoves = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (!aiPressed[i][j] && !Brett.pressed[i][j]) {
					availableMoves.add(new int[] { i, j });
				}
			}
		}
		return availableMoves;
	}

	/**
	 * Selects a random available field
	 * @return a random selected field
	 */
	public int[] getRandom() {

		availableMoves = getAvailableMoves();

		Random rand = new Random();
		int[] random = availableMoves.get(rand.nextInt(availableMoves.size()));

		System.out.println(random[0] + "" + random[1]);

		return random;
	}

	/**
	 * Attempt at implementing a minimax algorithm
	 * @param zeile column of the field which the user selected
	 * @param reihe row of the field which the user selected
	 * @return returns coordinates of minimaxed move
	 */
	public int[] minimax(int zeile, int reihe) {
		//True = Ai
		//False = Player
		
		int[] pressed = {zeile,reihe};
		
		usedMoves.add(pressed);
		
		

		int[] bestMove = {};
		int bestScore = Integer.MIN_VALUE;
		int bestSpot = 0;
		int score = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		List<int[]> availableMovesMM = getAvailableMoves();


		for (int[] availableMoves : availableMovesMM) {

			if(getScore()>= score){
				bestMove = availableMoves;
				score = getScore();
			}


		}

		return bestMove;
	}

	/**
	 * Gets score of current board
	 * @return score of current board (+10 on win / -10 on loss / 0 on other)
	 */
	public static int getScore() {
		if (checkWinPlayer()) {
			return -10;
		} else if (checkWinAi()) {
			return 10;
		} else {
			return 0;
		}
	}
	
	

}