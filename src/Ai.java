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

	public static boolean checkWinPlayer() {
		boolean win = false;

		boolean[][] pressed = Brett.getPressed();

		if (pressed[0][0] && pressed[0][1] && pressed[0][2] == true) {
			win = true;
		} else if (pressed[1][0] && pressed[1][1] && pressed[1][2] == true) {
			win = true;
		} else if (pressed[2][0] && pressed[2][1] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[0][0] && pressed[1][0] && pressed[2][0] == true) {
			win = true;
		} else if (pressed[0][1] && pressed[1][1] && pressed[2][1] == true) {
			win = true;
		} else if (pressed[0][2] && pressed[1][2] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[0][0] && pressed[1][1] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[2][0] && pressed[1][1] && pressed[0][2] == true) {
			win = true;
		}

		return win;

	}

	public static boolean checkWinAi() {
		boolean win = false;

		boolean[][] pressed = Brett.getPressedAi();

		if (pressed[0][0] && pressed[0][1] && pressed[0][2] == true) {
			win = true;
		} else if (pressed[1][0] && pressed[1][1] && pressed[1][2] == true) {
			win = true;
		} else if (pressed[2][0] && pressed[2][1] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[0][0] && pressed[1][0] && pressed[2][0] == true) {
			win = true;
		} else if (pressed[0][1] && pressed[1][1] && pressed[2][1] == true) {
			win = true;
		} else if (pressed[0][2] && pressed[1][2] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[0][0] && pressed[1][1] && pressed[2][2] == true) {
			win = true;
		} else if (pressed[2][0] && pressed[1][1] && pressed[0][2] == true) {
			win = true;
		}

		return win;

	}

	public void setPressed(int zeile, int reihe) {
		aiPressed[zeile][reihe] = true;
		Brett.pressedAi[zeile][reihe] = true;
	}

	public List<int[]> getAvailableMoves() {
		availableMoves = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (aiPressed[i][j] == false && Brett.pressed[i][j] == false) {
					availableMoves.add(new int[] { i, j });
				}
			}
		}

		//for (int[] availableMoves : availableMoves) {
			// System.out.println(availableMoves[0] + "" + availableMoves[1]);
		//}

		return availableMoves;
	}

	public int[] getRandom() {

		availableMoves = getAvailableMoves();

		Random rand = new Random();
		int[] random = availableMoves.get(rand.nextInt(availableMoves.size()));

		System.out.println(random[0] + "" + random[1]);

		return random;
	}

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

	public static int getScore() {
		if (checkWinPlayer() == true) {
			return -10;
		} else if (checkWinAi() == true) {
			return 10;
		} else {
			return 0;
		}
	}
	
	

}