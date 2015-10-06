package de.oth.pg2_8.aufgabe_3;

import de.oth.pg2_8.CaesarCode;


public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CaesarCode code = new CaesarCode();

		try {
			System.out.println(code.encoding("abc", 3));
			
			System.out.println(code.decryption("xyz", 3));
		} catch (IllegalCapitalLetterException e) {
			e.printStackTrace();
		} catch (InvalidCharacterException e) {
			e.printStackTrace();
		}
	}

}
