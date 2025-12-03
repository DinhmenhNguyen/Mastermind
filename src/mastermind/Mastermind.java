package mastermind;

import java.util.*;

public class Mastermind {

	public static void main(String[] args) {
		System.out.println("Welkom bij mastermind! \nJe moet de code raden met de volgende kleuren: \nRood, Oranje, Blauw, Groen, Paars of Geel. \nBegin hier:");


		Scanner sc = new Scanner(System.in); //De User input geven
		Random rd = new Random(); //Een random generator in het progamma maken
		// Codebreker
		String[] codeKrakersKleuren = { "Rood", "Oranje", "Blauw", "Groen", "Paars", "Geel" }; //De kleuren voor de Code en Codekraker geven

		// Codemaker
		String[] codeMakersKleuren = { "Wit", "Zwart", "Leeg" }; //De kleuren voor de Codemaker geven

		// Code
		String[] codeVakken = new String[4]; //4 plekken geopent voor de codeVakken

		for (int o = 0; o < 4; o++) { //4 verschillende kleuren kiezen voor de code
			int random = rd.nextInt(6); //Random number generator voor de kleuren
			codeVakken[o] = codeKrakersKleuren[random]; //geeft nummer in de codeKrakersKleuren array in en herhaalt 4 keer
		}

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
			} else if (inputs[0].equalsIgnoreCase(codeVakken[1]) || inputs[0].equalsIgnoreCase(codeVakken[2])
					|| inputs[0].equalsIgnoreCase(codeVakken[3])) {
				controles[0] = codeMakersKleuren[1];
			} else {
				controles[0] = codeMakersKleuren[2];
			}
			System.out.println(controles[0]);

			correct[1] = inputs[1].equalsIgnoreCase(codeVakken[1]);

			if (correct[1]) {
				controles[1] = codeMakersKleuren[0];
			} else if (inputs[1].equalsIgnoreCase(codeVakken[0]) || inputs[1].equalsIgnoreCase(codeVakken[2])
					|| inputs[1].equalsIgnoreCase(codeVakken[3])) {
				controles[1] = codeMakersKleuren[1];
			} else {
				controles[1] = codeMakersKleuren[2];
			}
			System.out.println(controles[1]);

			correct[2] = inputs[2].equalsIgnoreCase(codeVakken[2]);

			if (correct[2]) {
				controles[2] = codeMakersKleuren[0];
			} else if (inputs[2].equalsIgnoreCase(codeVakken[0]) || inputs[2].equalsIgnoreCase(codeVakken[1])
					|| inputs[2].equalsIgnoreCase(codeVakken[2])) {
				controles[2] = codeMakersKleuren[1];
			} else {
				controles[2] = codeMakersKleuren[2];
			}
			System.out.println(controles[2]);

			correct[3] = inputs[3].equalsIgnoreCase(codeVakken[3]);

			if (correct[3]) {
				controles[3] = codeMakersKleuren[0];
			} else if (inputs[3].equalsIgnoreCase(codeVakken[0]) || inputs[3].equalsIgnoreCase(codeVakken[1])
					|| inputs[3].equalsIgnoreCase(codeVakken[2])) {
				controles[3] = codeMakersKleuren[1];
			} else {
				controles[3] = codeMakersKleuren[2];
			}
			System.out.println(controles[3]);

			for (int t = 0; t < 4; t++) {

				boolean sum = (correct[0] && correct[1] && correct[2] && correct[3]);

				if (sum) {
					i = 11;
					System.out.println("Gefeliciteert!! U heeft gewonnen!");
				}
			}
		}
		System.out.println("Jammer! Je hebt verloren!");
		sc.close();
	}
}