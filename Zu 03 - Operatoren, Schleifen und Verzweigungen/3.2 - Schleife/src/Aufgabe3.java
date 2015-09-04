package Aufgabe3;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		int max, div;
		//Scanner initialisieren
		Scanner sc = new Scanner(System.in);
		
		System.out.println("max:");
		do {
			max = sc.nextInt();
			if (max < 0){
				System.out.println("Bitte eine nicht-negative Zahl eingeben:");
			}
		} while (max < 0);

		System.out.println("div:");
		do {
			div = sc.nextInt();
			if (div < 0){
				System.out.println("Bitte eine nicht-negative Zahl eingeben:");
			}
		} while (div < 0);
		
		for(int i = 0; i<=max; i++) {
			//Falls sich i durch div restlos teilen lässt, wird der aktuelle Wert von i über die Konsole ausgegeben
			if((i%div)==0) {               
				System.out.println(i);
			}
		}
	}

}
