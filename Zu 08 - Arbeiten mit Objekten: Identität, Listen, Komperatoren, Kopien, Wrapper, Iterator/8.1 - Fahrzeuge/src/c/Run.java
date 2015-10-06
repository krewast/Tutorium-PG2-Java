package de.oth.pg2_6.aufgabe_2.c;

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
		List<Fahrzeug> lstFahrzeug = new ArrayList<Fahrzeug>();
	
		lstFahrzeug.add(
				new LKW("NM-TG 790", true, COLOR.RED, 150, 4, 1000));
		lstFahrzeug.add(
				new LKW("NM-AA 80", true, COLOR.RED, 150, 4, 1000));
		lstFahrzeug.add(
				new LKW("NM-FF 70", false, COLOR.BLACK, 95, 6, 1500));
		lstFahrzeug.add(
				new PKW("R-GA 790", true, COLOR.RED, 150, 4, 5));
		lstFahrzeug.add(
				new PKW("R-AA 80", true, COLOR.RED, 150, 4, 5));
		lstFahrzeug.add(
				new PKW("R-FF 90", false, COLOR.BLACK, 95, 2, 4));
		
		Fahrzeug pkw1 = new PKW("NM-TG 890");
		Fahrzeug pkw2 = new PKW("NM-TG 790");
		Fahrzeug lkw = new LKW("R-FF 90");
		
		if (lstFahrzeug.contains(pkw1)){
			System.out.println("Gestohlenes Fahrzeug " + pkw1.getClass().getSimpleName());
		} else {
			System.out.println("Kein gesteholenes Fahrzeug " + pkw1.getClass().getSimpleName());
		}
		
		if (lstFahrzeug.contains(pkw2)){
			System.out.println("Gestohlenes Fahrzeug " + pkw2.getClass().getSimpleName());
		} else {
			System.out.println("Kein gesteholenes Fahrzeug " + pkw2.getClass().getSimpleName());
		}
		
		if (lstFahrzeug.contains(lkw)){
			System.out.println("Gestohlenes Fahrzeug " + lkw.getClass().getSimpleName());
		}
		
	}

}
