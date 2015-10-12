/*
 * READ ME
 *
 * Hi student!
 *
 * Before reading through the main program, make sure you know
 * what our classes do! I would advice you to start with the following:
 * 1- College.java (e.g. OTH Regensburg)
 * 2- Course.java (e.g. Wirtschaftsinformatik)
 * 3- Class.java (e.g. PG2)
 * 4- Student.java (e.g. You!)
 * 5- Grade.java (e.g. 1.3)
 *
 * After you did this, start with the initializeCollege() function to understand
 * how we initialize our objects.
 */

import java.util.Scanner;

public class MainProgram {

	private static College oth;

	public static void main(String[] args) {

		/*
		 * This code can be a little bit overwhelming for the first time. It's
		 * actually pretty simple. All we want to do is ask the user what he/she
		 * wants to do.
		 */

		// we initialize
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		// initialize oth college with a few courses (e.g. Wirtschaftsinformatik)
		initializeCollege();

		System.out.println("Willkommen bei der Studentenverwaltung");
		do {
			System.out.println("Was moechten Sie tun?\n");
			System.out.println("1. Neuen Student anlegen");
			System.out.println("2. Studenten-Stammdaten bearbeiten");
			System.out.println("3. Kursnoten zu einen Student hinzufügen");
			System.out.println("4. Informationen über einen Studenten ausgeben");
			System.out.println("5. Alle Studenten-Stamminformationen ausgeben");
			System.out.println("6. Alle Studenten-Informationen ausgeben");
			System.out.println("7. Hochschule-Informationen ausgeben");
			System.out.println("8. Programm beenden");

			choice = sc.nextInt();

			switch (choice) {

				case 1:
					// "1. Neuen Student anlegen"
					oth.addStudent(addStudentMain(sc));
					break;

				case 2:
					// "2. Studenten-Stammdaten bearbeiten"
					editStudentMain(sc);
					break;

				case 3:
					// "3. Kursnoten zu einen Student hinzufügen"
					addClassGradeStudentMain(sc);
					break;

				case 4:
					// "4. Informationen über einen Studenten ausgeben"
					Student student = MainHelper.chooseStudent(sc, oth);
					System.out.println(student.getCompleteData());
					break;

				case 5:
					// "5. Alle Studenten-Stamminformationen ausgeben
					System.out.println(oth.getAllBaseData());
					break;

				case 6:
					// "6. Alle Studenten-Informationen ausgeben"
					System.out.println(oth.getAllCompleteData());
					break;

				case 7:
					// "7. Hochschule-Informationen ausgeben"
					System.out.println(oth.getBaseData());
					break;

				case 8:
					// "8. Programm beenden"
					System.out.println("Das Programm wird beendet. Auf Wiedersehen.");
					break;

				default:
					// if the user gave us a wrong number
					System.err.println("Geben Sie eine Nummer zwischen 1 und 8 an");
					break;
			}
		} while(choice != 8);
	}

	private static Student addStudentMain(Scanner sc) {
		Student newStudent = new Student();
		newStudent = MainHelper.setStudentData(sc, newStudent);

		Course newCourse = MainHelper.chooseCourse(sc, oth);
		newStudent.setCourse(newCourse);

		return newStudent;
	}

	private static Student editStudentMain(Scanner sc) {
		// prints a list of all students
		Student editStudent = MainHelper.chooseStudent(sc, oth);
		editStudent = MainHelper.setStudentData(sc, editStudent);

		// user has to choose a new course
		Course editCourse = MainHelper.chooseCourse(sc, oth);
		editStudent.setCourse(editCourse);

		return editStudent;
	}

	private static void addClassGradeStudentMain(Scanner sc) {
		// select the student and the class
		Student editStudent = MainHelper.chooseStudent(sc, oth);
		Class editClass = MainHelper.chooseClass(sc, editStudent);

		double grade = 0;
		do {
			System.out.println("Bitte Note eingeben: ");
			grade = sc.nextDouble();
			editClass.setGrade(grade);
		} while (grade != 0);
	}

	public static void initializeCollege() {
		/*
		 * In this function, we initialize our college with a few courses and
		 * classes. In the end, we want to have the following structure:
		 *
		 * OTH Regensburg
		 * >> Wirtschaftsinformatik
		 			>> Bachelor Of Science
					>> Classes: PG1 & bwl1
				>> Allgemeine Informatik
					>> Bachelor Of Science
					>> Classes: PG1
				>> Wirtschaftsinformatik
					>> Master of Science
					>> Classes: Business Consulting & Moderne Datenbankkonzepte
		 */

		oth = new College("OTH Regensburg");

		Class pg1 = new Class();
		pg1.setCredits(8);
		pg1.setMultiplier(1);
		pg1.setName("Programmieren 1");

		Class bwl1 = new Class();
		bwl1.setCredits(8);
		bwl1.setMultiplier(2);
		bwl1.setName("BWL 1");

		Class mDB = new Class();
		mDB.setCredits(8);
		mDB.setMultiplier(2);
		mDB.setName("Moderne Datenbankkonzepte");

		Class bC = new Class();
		bC.setCredits(5);
		bC.setMultiplier(2);
		bC.setName("Business Consulting");

		Course info_bsc = new Course();
		info_bsc.setName("Allgemeine Informatik");
		info_bsc.setDegree("Bachelor");
		info_bsc.addClass(pg1);

		Course winfo_bsc = new Course();
		winfo_bsc.setName("Wirtschaftsinformatik");
		winfo_bsc.setDegree("Bachelor");
		winfo_bsc.addClass(pg1);
		winfo_bsc.addClass(bwl1);

		Course winfo_msc = new Course();
		winfo_msc.setName("Wirtschaftsinformatik");
		winfo_msc.setDegree("Master");
		winfo_msc.addClass(mDB);
		winfo_msc.addClass(bC);

		oth.addCourse(info_bsc);
		oth.addCourse(winfo_bsc);
		oth.addCourse(winfo_msc);
	}
}
