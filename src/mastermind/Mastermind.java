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
			String controle1 = codeVak1;
			String controle2 = codeVak2;
			String controle3 = codeVak3;
			String controle4 = codeVak4;

			// game

			boolean correct1 = input1.equalsIgnoreCase(controle1);

			if (correct1) {
				System.out.println(wit);
			} else {
				if (input1.equalsIgnoreCase(controle2)) {
					System.out.println(zwart);
				} else {
					if (input1.equalsIgnoreCase(controle3)) {
						System.out.println(zwart);
					} else {
						if (input1.equalsIgnoreCase(controle4)) {
							System.out.println(zwart);
						} else {
							System.out.println(leeg);
						}
					}
				}
			}

			boolean correct2 = input2.equalsIgnoreCase(controle2);

			if (correct2) {
				System.out.println(wit);
			} else {
				if (input2.equalsIgnoreCase(controle1)) {
					System.out.println(zwart);
				} else {
					if (input2.equalsIgnoreCase(controle3)) {
						System.out.println(zwart);
					} else {
						if (input2.equalsIgnoreCase(controle4)) {
							System.out.println(zwart);
						} else {
							System.out.println(leeg);
						}
					}
				}
			}
			
			boolean correct3 = input3.equalsIgnoreCase(controle3);

			if (correct3) {
				System.out.println(wit);
			} else {
				if (input3.equalsIgnoreCase(controle1)) {
					System.out.println(zwart);
				} else {
					if (input3.equalsIgnoreCase(controle2)) {
						System.out.println(zwart);
					} else {
						if (input3.equalsIgnoreCase(controle4)) {
							System.out.println(zwart);
						} else {
							System.out.println(leeg);
						}
					}
				}
			}
			
			boolean correct4 = input4.equalsIgnoreCase(controle4);

			if (correct4) {
				System.out.println(wit);
			} else {
				if (input4.equalsIgnoreCase(controle1)) {
					System.out.println(zwart);
				} else {
					if (input4.equalsIgnoreCase(controle2)) {
						System.out.println(zwart);
					} else {
						if (input4.equalsIgnoreCase(controle3)) {
							System.out.println(zwart);
						} else {
							System.out.println(leeg);
						}
					}
				}
			}

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
