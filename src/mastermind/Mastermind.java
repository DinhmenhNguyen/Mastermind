package mastermind;

import java.util.*;

public class Mastermind {

	public static void main(String[] args) {
		// Prints out the Introduction into the console.
		System.out.print("Welcome to Mastermind!" + " \nTry and guess the color code with the following colors:"
				+ " \nRed, Orange, Blue, Green, Purple or Yellow." + " \nEnter here:");

		// Kleuren voor Mastermind
		String[] codeMakerColors = { "White", "Black", "Empty" };

		// Win or lose
		boolean hasWon = false;

		// Code
		Helper help = new Helper();
		String[] code = help.generateCode();

		// Attempt
		for (int i = 0; i < 10; i = i + 1) {
			String[] inputs = help.inputs();

			// Result
			String[] results = new String[4];

			// Game
			boolean slotMatches[] = new boolean[4];

			slotMatches[0] = inputs[0].equalsIgnoreCase(code[0]);

			if (slotMatches[0]) {
				results[0] = codeMakerColors[0];
			} else if (inputs[0].equalsIgnoreCase(code[1]) || inputs[0].equalsIgnoreCase(code[2])
					|| inputs[0].equalsIgnoreCase(code[3])) {
				results[0] = codeMakerColors[1];
			} else {
				results[0] = codeMakerColors[2];
			}
			System.out.println(results[0]);

			slotMatches[1] = inputs[1].equalsIgnoreCase(code[1]);

			if (slotMatches[1]) {
				results[1] = codeMakerColors[0];
			} else if (inputs[1].equalsIgnoreCase(code[0]) || inputs[1].equalsIgnoreCase(code[2])
					|| inputs[1].equalsIgnoreCase(code[3])) {
				results[1] = codeMakerColors[1];
			} else {
				results[1] = codeMakerColors[2];
			}
			System.out.println(results[1]);

			slotMatches[2] = inputs[2].equalsIgnoreCase(code[2]);

			if (slotMatches[2]) {
				results[2] = codeMakerColors[0];
			} else if (inputs[2].equalsIgnoreCase(code[0]) || inputs[2].equalsIgnoreCase(code[1])
					|| inputs[2].equalsIgnoreCase(code[2])) {
				results[2] = codeMakerColors[1];
			} else {
				results[2] = codeMakerColors[2];
			}
			System.out.println(results[2]);

			slotMatches[3] = inputs[3].equalsIgnoreCase(code[3]);

			if (slotMatches[3]) {
				results[3] = codeMakerColors[0];
			} else if (inputs[3].equalsIgnoreCase(code[0]) || inputs[3].equalsIgnoreCase(code[1])
					|| inputs[3].equalsIgnoreCase(code[2])) {
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
			for (String codeSlot : code) {
				System.out.print(codeSlot + " ");
			}
		}
	}
}