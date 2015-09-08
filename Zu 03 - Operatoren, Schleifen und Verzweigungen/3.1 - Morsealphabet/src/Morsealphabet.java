package Aufgabe2;
import java.util.Scanner;


public class Aufgabe2 {
	
	public static void main(String[] args) {
		String morsce="";
		Scanner sc = new Scanner(System.in);
		
		//5 Zeichen einlesen und an String anfügen
		for (int i = 0; i <= 4; i++) {
			morsce += sc.next();
		}
		
		//Eingelesenen Morsce Code umwandeln
		int output = convertMorsceToInt(morsce);
		
		//Überprüfen, ob eingegebener MorsceCode einer Zahl von 0-9 zugeordnet werden konnte
		if(output != -1) {
			System.out.println(output);
		} else {
			System.err.println("Kein korrekter Morsce Code");
		}

	}

	public static int convertMorsceToInt(String morse) {
		if(morse.equals("-----")){
			return 0;
		}
		else if(morse.equals(".----")){
			return 1;
		}
		else if(morse.equals("..---")){
			return 2;
		}
		else if(morse.equals("...--")){
			return 3;
		}
		else if(morse.equals("....-")){
			return 4;
		}
		else if(morse.equals(".....")){
			return 5;
		}
		else if(morse.equals("-....")){
			return 6;
		}
		else if(morse.equals("--...")){
			return 7;
		}
		else if(morse.equals("---..")){
			return 8;
		}
		else if(morse.equals("----.")){
			return 9;
		}
		return -1;
	}

}
