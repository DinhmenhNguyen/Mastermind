package mastermind;

import java.util.*;

public class Helper {

	String[] codeGuesserColors = { "Red", "Orange", "Blue", "Green", "Purple", "Yellow" };
	String[] codeMakerColors = { "White", "Black", "Empty" };
	String[] codeSlots = new String[4];
	String[] results = new String[4];
	String[] inputs = new String[4];
	boolean slotMatches[] = new boolean[4];
	boolean hasWon = false;

	Scanner sc = new Scanner(System.in);

	public void getUserInput() {
		 for (int l = 0; l < inputs.length;) {
			inputs[l] = sc.next();
			boolean inputchecker = checkInput(inputs[l], codeGuesserColors);
			if (inputchecker == true) {
				l++;
			} else {
				System.out.println("Wrong input");
			}
		}
	}

	public boolean checkInput(String input, String[] collection) {

		for (String color : collection) {
			if (input.equalsIgnoreCase(color))
				return true;
		}
		return false;
	}

	public String[] generateCode() {
		Random random = new Random();
		for (int r = 0; r < codeSlots.length; r++) {
			codeSlots[r] = codeGuesserColors[random.nextInt(codeGuesserColors.length)];
			boolean revealCode = true;
			if(revealCode == true) {
				System.out.println(codeSlots[r]);
			}
		}
		return codeSlots;
	}

	// Game

	public void solveCode() {

		for (int i = 0; i < codeSlots.length; i++) {
			boolean solver = checkInput(inputs[i], codeSlots);
			slotMatches[i] = inputs[i].equalsIgnoreCase(codeSlots[i]);

			if (slotMatches[i]) {
				results[i] = codeMakerColors[0];
			} else if (solver) {
				results[i] = codeMakerColors[1];
			} else {
				results[i] = codeMakerColors[2];
			}
			System.out.println(results[i]);
		}
	}
}