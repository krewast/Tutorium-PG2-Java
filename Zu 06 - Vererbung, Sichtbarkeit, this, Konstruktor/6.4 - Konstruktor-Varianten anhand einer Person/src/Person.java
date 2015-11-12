package de.oth.pg2_5.aufgabe_1;

public class Person {

    private String _firstName;
    private String _lastName;

    public Person() {
        System.out.println("Create new person");
    }

    public Person(String firstName) {
        this._firstName = firstName;
        System.out.println("Create Person: " + firstName);
    }

    public Person(String firstName, String lastName) {
        this._firstName = firstName;
        this._lastName = lastName;
        System.out.println("Create Person: " + firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + this._firstName + ", lastName=" + this._lastName + "]";
    }
}
