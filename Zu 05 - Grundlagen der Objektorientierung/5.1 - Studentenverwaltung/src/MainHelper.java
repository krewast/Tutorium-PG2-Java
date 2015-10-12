import java.util.Scanner;

public class MainHelper {

    public static Student chooseStudent(Scanner sc, College oth) {
        // this prints you a list of all students with a number in front of it
        /*
         * example 1- Max Mustermann: 1234[Matrikelnummer] 2- Lillie Liesbert:
         * 5678[Matrikelnummer]
         */

        int j = 1;
        for (Student student : oth.getStudents()) {
            /*
             * #learnmore wonder what j++ makes in the println here? j++
             * increments the number after the operation. that means, after we
             * print the first student ID, we automatically increment i. there
             * is also ++i, which increments i BEFORE the operation.
             *
             * example: i = 0, j = 0 i = ++i // i = 1 j = j++ // j = 0
             * println(i) // i = 1 println(j) // j = 1
             */
            System.out.println(
                Integer.toString(j++) + "- " + student.getName() + ": " + student.getID() + "[Matrikelnummer]"
            );
        }

        System.out.println("Wählen Sie einen Studenten: ");
        int index = sc.nextInt() - 1; // Index fängt ab 0 an
        return oth.getStudents().get(index);
    }

    public static Class chooseClass(Scanner sc, Student student) {
        int i = 1;
        for (Class myclass : student.getCourse().getClasses()) {
            System.out.println(Integer.toString(i++) + ": " + myclass.getName());
        }

        System.out.println("Wählen Sie einen Kurs: ");
        int index = sc.nextInt() - 1;
        return student.getCourse().getClasses().get(index);
    }

    public static Course chooseCourse(Scanner sc, College oth) {
        /*
         * prints the following (for example) 1: Wirtschaftsinformatik
         * (Bachelor) 2: Allgemeine Informatik (Bachelor)
         */
        int i = 1;
        for (Course course : oth.getCourses()) {
            System.out.println(Integer.toString(i++) + ": " + course.getName() + " (" + course.getDegree() + ")");
        }

        // let user pick one of the course
        System.out.println("Wählen Sie einen Studiengang aus: ");
        int index_course = sc.nextInt() - 1; // Index fängt ab 0 an
        return oth.getCourses().get(index_course);
    }

    public static Student setStudentData(Scanner sc, Student editStudent) {
        System.out.println("Name: (alt: " + editStudent.getName() + ")");
        editStudent.setName(sc.next());

        System.out.println("Vorname: (alt: " + editStudent.getFirstName() + ")");
        editStudent.setFirstName(sc.next());

        System.out.println("Martikelnummer: (alt: " + editStudent.getID() + ")");
        editStudent.setID(Integer.parseInt(sc.next()));

        System.out.println("E-Mail: (alt: " + editStudent.getMail() + ")");
        editStudent.setMail(sc.next());

        return editStudent;
    }
}
