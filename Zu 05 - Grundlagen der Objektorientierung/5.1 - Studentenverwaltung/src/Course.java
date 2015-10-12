
// search for #learnmore if you want to learn some java tricks!

import java.util.ArrayList;
import java.util.List;

/*
 * This class called 'Course' manages the study course itself. It holds the
 * values 'classes' (e.g. List<PG1, PG2>), name (e.g. Wirtschaftsinformatik) and degree
 * (e.g. Bachelor of Science)
 */
public class Course {

    // #learnmore naming convention: class variables with underscore _
    private List<Class> _classes = new ArrayList<Class>();
    private String _name; // e.g. Computer Science
    private String _degree; // e.g. Bachelor of Science

    public Course() {
    }

    public Course(List<Class> classes, String name, String degree) {
        this._classes = classes;
        this._name = name;
        this._degree = degree;
    }

    // setter
    public void setClasses(List<Class> classes) {
        this._classes = classes;
    }

    /*
     * #learnmore make your code look well organized! check out the 'setName'
     * function and ask yourself why this code style is not what we want.
     * (compare it to the other functions).
     */
    void setName(String str) {
        this._name = str;
    }

    public void setDegree(String degree) {
        this._degree = degree;
    }

    // getter
    public List<Class> getClasses() {
        return this._classes;
    }

    public String getName() {
        return this._name;
    }

    public String getDegree() {
        return this._degree;
    }

    public void addClass(Class myclass) {
        this._classes.add(myclass);
    }

    public String getCoursesData() {
        String data = "";
        for (Class myclass : this._classes) {
            data += myclass.getClassData() + "\n---------\n";
        }
        return data;
    }
}
