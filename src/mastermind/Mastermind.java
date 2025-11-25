package mastermind;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		System.out.println("Welkom bij mastermind!");
		System.out.println("Je moet de code raden met de volgende kleuren:");
		System.out.println("Rood, Oranje, Blauw, Groen, Paars of Geel.");
		System.out.println("Begin hier:");

		Scanner sc = new Scanner(System.in);
		// Codebreker
		String[] codeKrakersKleuren = { "Rood", "Oranje", "Blauw", "Groen", "Paars", "Geel" };

		// Codemaker
		String[] codeMakersKleuren = { "Wit", "Zwart", "Leeg" };

		// Code
		String[] codeVakken = { codeKrakersKleuren[2], codeKrakersKleuren[2], codeKrakersKleuren[1],
				codeKrakersKleuren[2] };


		// poging
		for (int i = 0; i <= 10; i = i + 1) {
			String[] inputs = new String[4];
			
			for (int l = 0; l < inputs.length; l = l + 1) {
				inputs[l] = sc.next();
			}
			// controle

			String[] controles = new String[4];

			// game
			boolean correct[] = new boolean[4];

			correct[0] = inputs[0].equalsIgnoreCase(codeVakken[0]);

			if (correct[0]) {
				controles[0] = codeMakersKleuren[0];
			} else {
				if (inputs[0].equalsIgnoreCase(codeVakken[1])) {
					controles[0] = codeMakersKleuren[1];
				} else {
					if (inputs[0].equalsIgnoreCase(codeVakken[2])) {
						controles[0] = codeMakersKleuren[1];
					} else {
						if (inputs[0].equalsIgnoreCase(codeVakken[3])) {
							controles[0] = codeMakersKleuren[1];
						} else {
							controles[0] = codeMakersKleuren[2];
						}
					}
				}
			}
			System.out.println(controles[0]);

			correct[1] = inputs[1].equalsIgnoreCase(codeVakken[1]);

			if (correct[1]) {
				controles[1] = codeMakersKleuren[0];
			} else {
				if (inputs[1].equalsIgnoreCase(codeVakken[0])) {
					controles[1] = codeMakersKleuren[1];
				} else {
					if (inputs[1].equalsIgnoreCase(codeVakken[2])) {
						controles[1] = codeMakersKleuren[1];
					} else {
						if (inputs[1].equalsIgnoreCase(codeVakken[3])) {
							controles[1] = codeMakersKleuren[1];
						} else {
							controles[1] = codeMakersKleuren[2];
						}
					}
				}
			}
			System.out.println(controles[1]);

			correct[2] = inputs[2].equalsIgnoreCase(codeVakken[2]);

			if (correct[2]) {
				controles[2] = codeMakersKleuren[0];
			} else {
				if (inputs[2].equalsIgnoreCase(codeVakken[0])) {
					controles[2] = codeMakersKleuren[1];
				} else {
					if (inputs[2].equalsIgnoreCase(codeVakken[1])) {
						controles[2] = codeMakersKleuren[1];
					} else {
						if (inputs[2].equalsIgnoreCase(codeVakken[3])) {
							controles[2] = codeMakersKleuren[1];
						} else {
							controles[2] = codeMakersKleuren[2];
						}
					}
				}
			}
			System.out.println(controles[2]);

			correct[3] = inputs[3].equalsIgnoreCase(codeVakken[3]);

			if (correct[3]) {
				controles[3] = codeMakersKleuren[0];
			} else {
				if (inputs[3].equalsIgnoreCase(codeVakken[0])) {
					controles[3] = codeMakersKleuren[1];
				} else {
					if (inputs[3].equalsIgnoreCase(codeVakken[1])) {
						controles[3] = codeMakersKleuren[1];
					} else {
						if (inputs[3].equalsIgnoreCase(codeVakken[2])) {
							controles[3] = codeMakersKleuren[1];
						} else {
							controles[3] = codeMakersKleuren[2];
						}
					}
				}
			}
			System.out.println(controles[3]);

			if (correct[0]) {
				if (correct[1]) {
					if (correct[2]) {
						if (correct[3]) {
							i = 11;
							System.out.println("Gefeliciteert!! U heeft gewonnen!");
						}
					}
				}
			}
		}
		sc.close();
	}
}
