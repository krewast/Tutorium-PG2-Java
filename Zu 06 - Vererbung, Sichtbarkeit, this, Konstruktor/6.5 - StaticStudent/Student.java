public class Student {
    private String _firstName;
    private String _lastName;
    private int _id;
    private static int static_id = 1;

    // Constructor for Student (empty but initializing variables)
    public Student() {
        // general initializing
        this.setFirstName("");
        this.setLastName("");
        this.setID(Student.static_id);

        // adding a 1 to the static id
        Student.static_id++;
    }

    // getter and setter
    public int getID() {
        return this._id;
    }

    public void setID(int id) {
       this._id = id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String _lastName) {
        this._lastName = _lastName;
    }
}
