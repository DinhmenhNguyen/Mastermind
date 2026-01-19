package mastermind;

public class Mastermind {

	public static void main(String[] args) {
		// Prints out the Introduction into the console.
		System.out.print("Welcome to Mastermind!" + " \nTry and guess the color code with the following colors:"
				+ " \nRed, Orange, Blue, Green, Purple or Yellow." + " \nEnter here:");

		Helper help = new Helper();

		// Attempt

		boolean hasWon = false;
		
		help.generateCode();

		for (int i = 0; i < 10; i++) {
			help.getUserInput();

			help.solveCode();

			hasWon = help.slotMatches[0] && help.slotMatches[1] && help.slotMatches[2] && help.slotMatches[3];

			if (hasWon) {
				System.out.println("Congratulations!! You have won!");
				break;
			}
		}

		if (hasWon == false) {
			System.out.println("You have lost! Better luck next time!" + "\nThe code was: ");
			for (String code : help.codeSlots) {
				System.out.print(code + " ");
			}
		}
	}
}