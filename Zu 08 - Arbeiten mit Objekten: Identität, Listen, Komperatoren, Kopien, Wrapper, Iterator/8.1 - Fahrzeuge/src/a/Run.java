package de.oth.pg2_6.aufgabe_2.a;


import java.util.ArrayList;
import java.util.List;

import de.oth.pg2_6.aufgabe_2.COLOR;
import de.oth.pg2_6.aufgabe_2.Fahrzeug;
import de.oth.pg2_6.aufgabe_2.LKW;
import de.oth.pg2_6.aufgabe_2.PKW;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Fahrzeug> fahrzeugListe = new ArrayList<Fahrzeug>();
		
		//Erzeugen von verschiedenen PKWs
		PKW auto1 = new PKW("NM-TG 790", true, COLOR.RED,150, 4, 5);
		PKW auto2 = new PKW("NM-AA 80", true, COLOR.RED,150, 4, 5);
		PKW auto3 = new PKW("NM-FF 70", false, COLOR.BLACK,95, 2, 5);
		
		LKW lkw1 = new LKW("R-AA 99", true, COLOR.GREEN, 200, 6, 1500);
		
		
		fahrzeugListe.add(auto1);
		fahrzeugListe.add(auto2);
		fahrzeugListe.add(auto3);
		fahrzeugListe.add(lkw1);
		
		for (Fahrzeug fahrzeug : fahrzeugListe){
			System.out.println(fahrzeug);
		}
		
	}

}
