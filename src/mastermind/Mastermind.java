package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		System.out.println("Welkom bij mastermind!");
		System.out.println("Je moet de code raden met de volgende kleuren:");
		System.out.println("Rood, Oranje, Blauw, Groen, Paars of Geel.");
		System.out.println("Begin hier:");

		Scanner sc = new Scanner(System.in);
		// Codebreker
		String rood = "Rood";		
		String oranje = "Oranje";
		String blauw = "Blauw";
		String groen = "Groen";
		String paars = "Paars";
		String geel = "Geel";
		// Codemaker
		String wit = "Wit";
		String zwart = "Zwart";
		String leeg = "Leeg";

		// Code
		String codeVak1 = geel;
		String codeVak2 = groen;
		String codeVak3 = blauw;
		String codeVak4 = rood;

		// poging
		for (int i = 0; i <= 10; i = i + 1) {
			String input1 = sc.next();
			String input2 = sc.next();
			String input3 = sc.next();
			String input4 = sc.next();

			// controle
			String controle1;
			String controle2;
			String controle3;
			String controle4;

			// game

			boolean correct1 = input1.equalsIgnoreCase(codeVak1);

			if (correct1) {
				controle1=wit;
			} else {
				if (input1.equalsIgnoreCase(codeVak2)) {
					controle1=zwart;
				} else {
					if (input1.equalsIgnoreCase(codeVak3)) {
						controle1=zwart;
					} else {
						if (input1.equalsIgnoreCase(codeVak4)) {
							controle1=zwart;
						} else {
							controle1=leeg;
						}
					}
				}
			} System.out.println(controle1);

			boolean correct2 = input2.equalsIgnoreCase(codeVak2);

			if (correct2) {
				controle2=wit;
			} else {
				if (input2.equalsIgnoreCase(codeVak1)) {
					controle2=zwart;
				} else {
					if (input2.equalsIgnoreCase(codeVak3)) {
						controle2=zwart;
					} else {
						if (input2.equalsIgnoreCase(codeVak4)) {
							controle2=zwart;
						} else {
							controle2=leeg;
						}
					}
				}
			} System.out.println(controle2);
			
			boolean correct3 = input3.equalsIgnoreCase(codeVak3);

			if (correct3) {
				controle3=wit;
			} else {
				if (input3.equalsIgnoreCase(codeVak1)) {
					controle3=zwart;
				} else {
					if (input3.equalsIgnoreCase(codeVak2)) {
						controle3=zwart;
					} else {
						if (input3.equalsIgnoreCase(codeVak4)) {
							controle3=zwart;
						} else {
							controle3=leeg;
						}
					}
				}
			} System.out.println(controle3);
			
			boolean correct4 = input4.equalsIgnoreCase(codeVak4);

			if (correct4) {
				controle4=wit;
			} else {
				if (input4.equalsIgnoreCase(codeVak1)) {
					controle4=zwart;
				} else {
					if (input4.equalsIgnoreCase(codeVak2)) {
						controle4=zwart;
					} else {
						if (input4.equalsIgnoreCase(codeVak3)) {
							controle4=zwart;
						} else {
							controle4=leeg;
						}
					}
				}
			} System.out.println(controle4);

			if (correct1) {
				if (correct2) {
					if (correct3) {
						if (correct4) {
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
