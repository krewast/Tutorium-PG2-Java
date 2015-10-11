package de.oth.pg2.comparable;

public class Person implements Comparable{
	
    public String name;
    public int size;
    public Beruf beruf;
    
	public Person(String name, int size, Beruf beruf) {
		this.name = name;
		this.size = size;
		this.beruf = beruf;
	}

	@Override
	public int compareTo(Object o) {
	
		if (o instanceof Person){
			Person other = (Person) o;
			if (this.beruf.gehalt > other.beruf.gehalt){
				return 1;
			}
			if (this.beruf.gehalt < other.beruf.gehalt){
				return -1;
			}
			else {
				if (this.size < other.size){
					return 1;
				} else if (this.size > other.size){
					return -1;
				}
			}
		}
		return 0;
	}
}
