package pg2._04;

import java.util.Scanner;

public class Buchstabenmixer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Wort ein:");
		String myString = sc.next();
		
		System.out.println("Neues Wort:" + mix(myString));
		
	}
	
	public static String mix(String myString){
		
		String newString = "";
		
		for (int i = 0; i < myString.length()-1; i++){
			newString += myString.substring(i+1,i+2);
			
		}
		newString += myString.substring(0,1);
		
		return newString;
	}

}
