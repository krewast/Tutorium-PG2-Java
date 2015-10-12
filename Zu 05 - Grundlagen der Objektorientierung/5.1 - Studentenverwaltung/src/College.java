// search for #learnmore if you want to learn some java tricks!


// imports
import java.util.ArrayList;
import java.util.List;

// class definition
public class College {
  // initial class variables
  // #learnmore naming convention: class variables with underscore _
  private List<Student> _students = new ArrayList<Student>();
  private List<Course> _courses = new ArrayList<>();
  private String _name;

  // that is the constructor for the college to initialize the name
  public College(String name) {
    /* #learnmore
     * wonder what 'this' means? 'this' basically means you want to use the 'name'
     * attribute from the class (the private variable in line 16) and not the
     * 'name' variable in this function. With 'this' you make sure that your
     * program knows which attribute you mean.
     */
    this._name = name;
  }

  // getter for initial variables
  public List<Student> getStudents() {
    return this._students;
  }

  public String getName() {
    return this._name;
  }

  public List<Course> getCourses() {
    return this._courses;
  }

  // setter for initial variables
  public void setStudents(List<Student> students) {
    this._students = students;
  }

  public void setName(String name) {
    this._name = name;
  }

  public void setCourses(List<Course> courses) {
    this._courses = courses;
  }

  // add some data!
  public void addStudent(Student student) {
    this._students.add(student);
  }

  public void addCourse(Course course){
    this._courses.add(course);
  }

  /*
   * returns all data about the college (which is all data for all students)
   * example: (student x is the equivalent to the raw data from
   * student.getBaseData())
   *
   * student 1
   * ---------
   * student 2
   * ---------
   */
  public String getAllBaseData() {
    String returnBaseData = "";
    for (Student student : this._students){
      returnBaseData += student.getBaseData() + "\n---------\n";
    }
    return returnBaseData;
  }

  public String getAllCompleteData() {
    String returnAllCompleteData = "";
    for (Student student : this._students){
      returnAllCompleteData += student.getCompleteData() + "\n---------\n";
    }
    return returnAllCompleteData;
  }

  /* #learnmore
   *
   * alternatively to getAllBaseData and getAllCompleteData, you can write this
   * variable mode
   * (0): base
   * (1): complete
   */
  public String getData(String mode) {
    String returnData = "";
    for (Student student : this._students) {
      /* #learnmore
       *
       * the operator ?: is the short version of if else, that means:
       * if (mode == "base") {
       *  	student.getBaseData();
       * } else {
       *  	student.getCompleteData();
       * }
       * is equal to the following statement
       */
      returnData += mode == "base"
        ? student.getBaseData()
            : student.getCompleteData();
        returnData += "\n---------\n";
    }
    return returnData;
  }

  public String getBaseData() {
    String all_courses = "\n";
    for (Course course : this._courses){
      // [Programmieren 2 ()]
      all_courses += "[" + course.getName() + " ("+ course.getDegree() + ")]\n";
    }
    return "Name: " + this._name + all_courses;
  }

}
