package pg2._04;

import java.util.Scanner;

public class RomanNumbers {

	static String[] romanNumbers = new String[] { "", "I", "V", "X", "L", "C",
			"D", "M" };
	static int[] dezimalBlocks = new int[] { 0, 1, 5, 10, 50, 100, 500, 1000 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Geben Sie ein Dezimalzahl ein(Zwischen 1 und 999):");
		int dez = sc.nextInt();
		// Überprüfung, ob die Zahl im definierten Bereich liegt
		if (dez > 0 && dez < dezimalBlocks[7]) {
			// For-Schleife zum Durchlaufen der beiden Arrays
			for (int i = 7; i > 0; i--) {
				// Schleife, welche solange läuft, bis der (i-1)-te Zahlenblock
				// abgearbeitet ist
				while (dez > dezimalBlocks[i - 1]) {
					if (dez >= dezimalBlocks[i]) {
						System.out.print(romanNumbers[i]);
						dez -= dezimalBlocks[i];
					} else {
						// Überprüfung, ob sich die Zahl auch darstallen lässt,
						// wenn man die nächst kleinere abzieht
						// (z.B. 40 = XL [50-10]
						if (dez == (dezimalBlocks[i] - dezimalBlocks[i - 1])) {
							System.out.print(romanNumbers[i - 1]
									+ romanNumbers[i]);
							dez -= (dezimalBlocks[i] - dezimalBlocks[i - 1]);
						} else { // Ansonsten abziehen des nächst kleineren
									// Zahlenblocks
							System.out.print(romanNumbers[i - 1]);
							dez -= dezimalBlocks[i - 1];
						}
					}
				}
			}
		} else {
			System.out.println("Zahl nicht im definierten Bereich!");
		}

	}
}
