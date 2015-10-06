package de.oth.pg2.grosseUebung;

import java.util.Scanner;

public class Run2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int eingabe = 0;
		
		Getraenkeautomat automat = new Getraenkeautomat();


		while (automat.verfuegbareGetraenkeAusgeben() != 0) {
			System.out.println("Bitte waehlen Sie ein Getraenk: ");
			eingabe = sc.nextInt();
			automat.getraenkeausgabeUndBezahlen(eingabe, sc);
			
			
		}
	}

}
