package mastermind;

import java.util.*;


public class Helper {

	public String[] generateCode() {

		String[] codeGuesserColors = { "Red", "Orange", "Blue", "Green", "Purple", "Yellow" };

		String[] codeSlots = new String[4];
		
		for (int r = 0; r < 4; r++) {
			
			Random rd = new Random();
			
			int random = rd.nextInt(6);
			codeSlots[r] = codeGuesserColors[random];
		}
		return codeSlots;
	}

	public String[] inputs() {
		Scanner sc = new Scanner(System.in);
		
		String[] inputs = new String[4];
		
		for (int l = 0; l < inputs.length; l++) {
			inputs[l] = sc.next();
		}
		return inputs;
	}
	
	public String[] codeChecker() {
		
	}
}
