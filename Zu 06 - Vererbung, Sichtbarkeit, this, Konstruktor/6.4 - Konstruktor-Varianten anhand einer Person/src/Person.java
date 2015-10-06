package de.oth.pg2_5.aufgabe_1;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(){
		System.out.println("Create new person");
	}
	public Person(String firstName){
		this.firstName = firstName;
		System.out.println("Create Person: " + firstName);
	}
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Create Person: " + firstName + " " + lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
}
