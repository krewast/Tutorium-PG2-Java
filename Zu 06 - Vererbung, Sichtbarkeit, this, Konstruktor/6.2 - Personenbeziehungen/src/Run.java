package de.oth.pg2.grosseUebung.aufgabe3;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person person1 = new Person("Jim likes Larry and Jean, but hates Kim");
		person1.print();
		
		Person person2 = new Person("Bob loves Jean, and likes Larry and Kim");
		person2.print();
//
		Person person3 = new Person("Jean loves Bob, likes Jim, but hates Kim");
		person3.print();
//		
		Person person4 = new Person("Kim hates Jim, likes Larry and Bob");
		person4.print();
//		
		Person person5 = new Person("Larry loves Martin, and hates Karl and Jean");
		person5.print();
	}

}
