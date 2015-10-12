// search for #learnmore if you want to learn some java tricks!

public class Student {

    private String _name;
    private String _firstName;
    private int _ID;
    private String _mail;
    private Course _course;

    // setter
    public void setName(String name) {
        this._name = name;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    /*
     * #learnmore now it's getting interesting. Instead of setting the ID right
     * away, you want to check whether it's a valid ID. (exactly 7 digits)
     */
    public boolean setID(int id) {
        if (Integer.toString(id).length() == 7) {
            this._ID = id;
            return true;
        }
        System.err.print("Martikelnummer muss 7-stellig und numerisch sein");
        return false;
    }

    public void setMail(String mail) {
        this._mail = mail;
    }

    public void setCourse(Course course) {
        this._course = course;
    }

    // getter
    public String getName() {
        return this._name;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public int getID() {
        return this._ID;
    }

    public String getMail() {
        return this._mail;
    }

    public Course getCourse() {
        return this._course;
    }

    public String getBaseData() {
        return "Name des Studierenden: " + this._firstName + ", " + this._name + "\n" + "(angestreber)  Abschluss:  "
                + this._course.getDegree() + "\n" + "Fach: " + this._course.getName() + "\n" + "Martikelnummer: "
                + this._ID + "\n" + "E-Mail: " + this._mail + "\n";
    }

    public String getCompleteData() {
        return "Name des Studierenden: " + this._firstName + ", " + this._name + "\n" + "(angestrebter)  Abschluss:  "
                + this._course.getDegree() + "\n" + "Fach: " + this._course.getName() + "\n" + "Matrikelnummer: "
                + this._ID + "\n" + "E-Mail: " + this._mail + "\n" + " -- Pruefungen --\n"
                + this._course.getCoursesData() + "\n" + "Notendurchschnitt: "
                + String.format("%10.2f", this.getGradeAverage()) + "\n";
    }

    public double getGradeAverage() {
        int counter = 0;
        double all = 0;

        for (Class myclass : this._course.getClasses()) {
            if (myclass.getGrade() != 0) {
                all += myclass.getGrade() * myclass.getMultiplier() * myclass.getCredits();
                counter += (myclass.getMultiplier() * myclass.getCredits());
            }
        }
        return (all / counter);
    }
}
