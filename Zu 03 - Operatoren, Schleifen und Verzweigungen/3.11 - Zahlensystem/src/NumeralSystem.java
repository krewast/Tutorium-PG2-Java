package pg2._04;

import java.util.Scanner;

public class NumeralSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dez;

		System.out.println("Welche Dezimalzahl moechten Sie umwandeln: ");
		
		dez = sc.nextInt();
		
		dualTransformation(dez);
		hexTransformation(dez);
		

	}

	static void hexTransformation(int dez) {

		char[] hexArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };

		String hex = "";
		while (dez > 0) {
			hex = hexArray[dez % 16] + hex;
			dez = dez / 16;
		}

		System.out.println("Hex-Wert: " + hex);
	}

	static void dualTransformation(int dez) {

		int i = 0, temp; // i=Hilfszähler, // temp=Hilfsvariable

		int[] bField = new int[20];

		do // Berechnung des Binärwertes
		{
			temp = dez / 2;
			bField[i] = dez - 2 * temp;
			i++;
			dez = temp;
		} while (dez >= 1);

		i--;
		System.out.print("Binaer-Wert: ");

		for (; i >= 0; i--) { // geordnete Ausgabe des Binärwertes

			System.out.print(bField[i]);
		}
		System.out.println();
	}

}
