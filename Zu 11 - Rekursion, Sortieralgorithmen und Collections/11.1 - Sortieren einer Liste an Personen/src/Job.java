package de.oth.pg2.comparable;

public class Job {
    private String _name;
    private float _salary;

    public Job(String name, float salary) {
        this._name = name;
        this._salary = salary;
    }
    
    public float getSalary() {
        return this._salary;
    }
    
    public String getName() {
        return this._name;
    }
}
