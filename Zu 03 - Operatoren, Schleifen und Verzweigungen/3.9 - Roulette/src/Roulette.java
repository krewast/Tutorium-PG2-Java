package pg2._04;

import java.util.Scanner;

public class Roulette {

	static int seedFunding = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Willkommen beim Roulette Spiel");

		while (seedFunding > 0) {
			System.out.println("Ihr aktuelles Guthaben beträgt " + seedFunding
					+ " Euro.");
			System.out
					.println("Setzten Sie einen Betrag für Ihr nächstes Spiel:");
			int use = sc.nextInt();
			if (use <= seedFunding) {

				System.out
						.println("Setzten Sie auf eine Farbe(r/s) oder eine Zahl(1-35)");
				String choice = sc.next();
				seedFunding -= use;
				if (( choice.equals("r"))) {

					int random = myRandom();
					
					if (random%2 == 0){
						seedFunding += use * 2;
					}
				} else if (choice.equals("s")){

					int random = myRandom();
					
					if (random%2 != 0){
						seedFunding += use * 2;
					}
				}
				else if ((Integer.valueOf(choice) >= 1 && Integer.valueOf(choice) <= 36)){

					int random = myRandom();
					
					if (random == Integer.valueOf(choice)){
						seedFunding += use * 35;
					}
				} else {
					System.err.println("Falsche Auswahl! Neu beginnen!");
				}
			} else {
				System.err
						.println("Eingesetzte Betrag zu hoch - neuen eingeben");
			}
		}
	}

	public static int myRandom() {
		int start = 1;
		int end = 36;
		int random = (int) (Math.random() * (end - start) + start);
		System.out.println("Roulette - Ergebnis: " + random);
		return random;
	}

}
