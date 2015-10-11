package de.oth.pg2.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainProgramm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beruf b1 = new Beruf("gutBezahlterJob", 5000);

		Beruf b2 = new Beruf("schlechtBezahlterJob", 2000);

		Person p3 = new Person("P3", 180, b2);
		Person p1 = new Person("P1", 180, b1);
		Person p2 = new Person("P2", 185, b1);
		
		List<Person> list = new ArrayList<Person>();

		System.out.println("Unsortiert: ");
		list.add(p2);
		list.add(p1);
		list.add(p3);
		list.add(p1);
		for (Person p : list){
			System.out.println(p.name + " - Gehalt:" + p.beruf.gehalt + " - Size: " + p.size);
		}

		Collections.sort(list);
		
		System.out.println("Sortiert: ");
		for (Person p : list){
			System.out.println(p.name + " - Gehalt:" + p.beruf.gehalt + " - Size: " + p.size);
		}

	}

}
