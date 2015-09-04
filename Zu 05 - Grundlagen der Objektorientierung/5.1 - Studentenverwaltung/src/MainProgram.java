package de.oth.pg2.qis;

import java.util.Scanner;

public class MainProgram {

	
	private static College oth;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		init();
		
		
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
			
			switch (choice){
			case 1:
				oth.addStudent(addStudentMain(sc));
				break;
			case 2:
				editStudentMain(sc);
				break;
			case 3:
				addCourseNoteStudentMain(sc);
				break;
			case 4:
				int i = 1;
				for (Student student : oth.getStudents()){
					System.out.println(i + ": " + student.getMatriculationNumber() + "[Matrikelnummer]");
					i++;
				}
				System.out.println("Wählen Sie einen Studenten: ");
				int index2 = sc.nextInt();
				if (index2 <= oth.getStudents().size()){
					System.out.println(oth.getStudents().get(index2)
							.getCompleteData());
				} else {
					System.err.println("Keinen Treffer gefunden");
				}
				
				break;
			case 5:
				System.out.println(oth.getAllBaseData());
				break;
			case 6:
				System.out.println(oth.getAllCompleteData());
				break;
			case 7:
				System.out.println(oth.getBaseData());
				break;
			case 8:
				System.out.println("Das Programm wird beendet. Auf Wiedersehen.");
				break;
			default: 
				System.err.println("Geben Sie eine Nummer zwischen 1 und 5 an");
				break;
			}
			
		} while(choice != 8);
	}
	
	private static void addCourseNoteStudentMain(Scanner sc) {
		int j = 1;
		for (Student student : oth.getStudents()){
			System.out.println(j + ": " + student.getMatriculationNumber() + "[Matrikelnummer]");
			j++;
		}
		System.out.println("Wählen Sie einen Studenten: ");
		int index1 = sc.nextInt() - 1;
		Student editStudent = oth.getStudents().get(index1);
		
		int i = 1;
		for (Course editCourse : editStudent.getCourseOfStudies().getCourses()){
			System.out.println(i + ": " + editCourse.getName());
			i++;
		}
		System.out.println("Wählen Sie einen Kurs: ");
		int index2 = sc.nextInt() - 1;
		Course editCourse = editStudent.getCourseOfStudies().getCourses().get(index2);
		
		double note = 0;
		do {
		System.out.println("Bitte Note eingeben: ");
		note = sc.nextDouble();

		} while (!editCourse.setNote(note));
		
	}

	private static Student addStudentMain(Scanner sc) {
		Student newStudent = new Student();
		System.out.println("Name: ");
		newStudent.setName(sc.next());
		System.out.println("Vorname: ");
		newStudent.setFirstname(sc.next());
		System.out.println("Martikelnummer: ");
		newStudent.setMatriculationNumber(sc.next());
		System.out.println("E-Mail: ");
		newStudent.seteMail(sc.next());
		
		int i = 1;
		for (CourseOfStudies courseOfStudie : oth.getCoursesOfStudies()){
			System.out.println(i + ": " + courseOfStudie.getName() + " ("+courseOfStudie.getTargetFinal()+")");
			i++;
		}
		System.out.println("Wählen Sie einen Studiengang aus: ");
		int index = sc.nextInt() - 1; //Index fängt ab 0 an
		newStudent.setCourseOfStudies(oth.getCoursesOfStudies().get(index));
		
		return newStudent;
	}

	private static Student editStudentMain(Scanner sc) {
		
		int j = 1;
		for (Student student : oth.getStudents()){
			System.out.println(j + ": " + student.getMatriculationNumber() + "[Matrikelnummer]");
			j++;
		}
		System.out.println("Wählen Sie einen Studenten: ");
		int index = sc.nextInt();
		Student editStudent = oth.getStudents().get(index);
		
		System.out.println("Name: (alt: " + editStudent.getName() + ")");
		editStudent.setName(sc.next());
		System.out.println("Vorname: (alt: " + editStudent.getFirstname() + ")");
		editStudent.setFirstname(sc.next());
		System.out.println("Martikelnummer: (alt: " + editStudent.getMatriculationNumber() + ")");
		editStudent.setMatriculationNumber(sc.next());
		System.out.println("E-Mail: (alt: " + editStudent.geteMail() + ")");
		editStudent.seteMail(sc.next());
		
		
		int i = 1;
		for (CourseOfStudies courseOfStudie : oth.getCoursesOfStudies()){
			System.out.println(i + ": " + courseOfStudie.getName() + " ("+courseOfStudie.getTargetFinal()+")");
			i++;
		}
		System.out.println("Wählen Sie einen Studiengang aus: (alt: " + editStudent.getCourseOfStudies().getName() +")");
		int index1 = sc.nextInt() - 1; //Index fängt ab 0 an
		editStudent.setCourseOfStudies(oth.getCoursesOfStudies().get(index1));
		
		return editStudent;
	}

	
	public static void init(){
		oth = new College("OTH Regensburg");
		
		Course pg1 = new Course();
		pg1.setCredit(8);
		pg1.setMultiplier(1);
		pg1.setName("Programmieren 1");

		Course pg2 = new Course();
		pg2.setCredit(8);
		pg2.setMultiplier(2);
		pg2.setName("Programmieren 2");
		
		Course bwl1 = new Course();
		bwl1.setCredit(8);
		bwl1.setMultiplier(2);
		bwl1.setName("BWL 1");
		
		Course bwl2 = new Course();
		bwl2.setCredit(8);
		bwl2.setMultiplier(2);
		bwl2.setName("BWL 2");
		
		Course mDB = new Course();
		mDB.setCredit(8);
		mDB.setMultiplier(2);
		mDB.setName("Moderne Datenbankkonzepte");
		
		Course bC = new Course();
		bC.setCredit(5);
		bC.setMultiplier(2);
		bC.setName("Business Consulting");
		
		CourseOfStudies infoBachelor = new CourseOfStudies();
		infoBachelor.setName("Allgemeine Informatik");
		infoBachelor.setTargetFinal("Bachelor");
		infoBachelor.addCourse(pg1);
		infoBachelor.addCourse(pg2);
		
		CourseOfStudies wInfoBachelor = new CourseOfStudies();
		wInfoBachelor.setName("Wirtschaftsinformatik");
		wInfoBachelor.setTargetFinal("Bachelor");
		wInfoBachelor.addCourse(pg1);
		wInfoBachelor.addCourse(pg2);
		wInfoBachelor.addCourse(bwl1);
		wInfoBachelor.addCourse(bwl2);
		
		CourseOfStudies wInfoMaster = new CourseOfStudies();
		wInfoMaster.setName("Wirtschaftsinformatik");
		wInfoMaster.setTargetFinal("Master");
		wInfoMaster.addCourse(mDB);
		wInfoMaster.addCourse(bC);
		
		oth.addCoursesOfStudies(infoBachelor);
		oth.addCoursesOfStudies(wInfoBachelor);
		oth.addCoursesOfStudies(wInfoMaster);
		
	}

}
