package de.oth.pg2.comparable;

public class Person implements Comparable {

    public String _name;
    public int _size;
    public Job _job;

    public Person(String name, int size, Job job) {
        this._name = name;
        this._size = size;
        this._job = job;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Person) {
            Person other = (Person) o;
            
            if (this.getJob().getSalary() > other.getJob().getSalary()) {
                // this earns more than other 
                return 1;
            }
            
            if (this.getJob().getSalary() < other.getJob().getSalary() ) {
                // this earns less than other
                return -1;
            } else {
                // this earns as much as other 
                if (this.getSize() < other.getSize()) {
                    // this size is smaller than others
                    return 1;
                } else if (this.getSize() > other.getSize()) {
                    // this size is bigger than others
                    return -1;
                }
            }
        }
        return 0;
    }
    
    public String getName() {
        return this._name;
    }
    
    public int getSize() {
        return this._size;
    }
    
    public Job getJob() {
        return this._job;
    }
}
