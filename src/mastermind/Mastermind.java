package mastermind;

import java.util.*;

public class Mastermind {

	public static void main(String[] args) {
		System.out.print("Welcome to Mastermind!" + " \nTry and guess the color code with the following colors:"
				+ " \nRed, Orange, Blue, Green, Purple or Yellow." + " \nEnter here:");
		
		String[] codeGuesserColors = { "Red", "Orange", "Blue", "Green", "Purple", "Yellow" };

		// Codemaker
		String[] codeMakerColors = { "White", "Black", "Empty" };

		// Win or lose
		boolean hasWon = false;

		// Code
		String[] codeSlots = new String[4];
		for (int o = 0; o < 4; o++) {
			Random rd = new Random();
			int random = rd.nextInt(6);
			codeSlots[o] = codeGuesserColors[random];
		}

		// Attempt
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i = i + 1) {
			String[] inputs = new String[4];
			for (int l = 0; l < inputs.length; l = l + 1) {
				inputs[l] = sc.next();
			}
			// Result

			String[] results = new String[4];

			// Game
			boolean slotMatches[] = new boolean[4];

			slotMatches[0] = inputs[0].equalsIgnoreCase(codeSlots[0]);

			if (slotMatches[0]) {
				results[0] = codeMakerColors[0];
			} else if (inputs[0].equalsIgnoreCase(codeSlots[1]) || inputs[0].equalsIgnoreCase(codeSlots[2])
					|| inputs[0].equalsIgnoreCase(codeSlots[3])) {
				results[0] = codeMakerColors[1];
			} else {
				results[0] = codeMakerColors[2];
			}
			System.out.println(results[0]);

			slotMatches[1] = inputs[1].equalsIgnoreCase(codeSlots[1]);

			if (slotMatches[1]) {
				results[1] = codeMakerColors[0];
			} else if (inputs[1].equalsIgnoreCase(codeSlots[0]) || inputs[1].equalsIgnoreCase(codeSlots[2])
					|| inputs[1].equalsIgnoreCase(codeSlots[3])) {
				results[1] = codeMakerColors[1];
			} else {
				results[1] = codeMakerColors[2];
			}
			System.out.println(results[1]);

			slotMatches[2] = inputs[2].equalsIgnoreCase(codeSlots[2]);

			if (slotMatches[2]) {
				results[2] = codeMakerColors[0];
			} else if (inputs[2].equalsIgnoreCase(codeSlots[0]) || inputs[2].equalsIgnoreCase(codeSlots[1])
					|| inputs[2].equalsIgnoreCase(codeSlots[2])) {
				results[2] = codeMakerColors[1];
			} else {
				results[2] = codeMakerColors[2];
			}
			System.out.println(results[2]);

			slotMatches[3] = inputs[3].equalsIgnoreCase(codeSlots[3]);

			if (slotMatches[3]) {
				results[3] = codeMakerColors[0];
			} else if (inputs[3].equalsIgnoreCase(codeSlots[0]) || inputs[3].equalsIgnoreCase(codeSlots[1])
					|| inputs[3].equalsIgnoreCase(codeSlots[2])) {
				results[3] = codeMakerColors[1];
			} else {
				results[3] = codeMakerColors[2];
			}
			System.out.println(results[3]);

			hasWon = (slotMatches[0] && slotMatches[1] && slotMatches[2] && slotMatches[3]);

			if (hasWon) {
				System.out.println("Congratulations!! You have won!");
				break;
			}
		}
		if (hasWon == false) {
			System.out.print("You have lost! Better luck next time!" + " \nThe code was: ");
			for (String codeVak : codeSlots) {
				System.out.print(codeVak + " ");
			}
		}
		sc.close();
	}
}