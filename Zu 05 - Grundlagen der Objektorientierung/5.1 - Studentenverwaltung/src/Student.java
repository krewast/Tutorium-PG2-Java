package de.oth.pg2.qis;

public class Student {

	private String name;
	private String firstname;
	private String matriculationNumber;
	private String eMail;
	private CourseOfStudies courseOfStudies = new CourseOfStudies();
	
	public String getBaseData(){
		return "Name des Studierenden: " + firstname + " " + name + "\n" +
				"(angestreber)  Abschluss:  " + courseOfStudies.getTargetFinal() + "\n" +
				"Fach: " + courseOfStudies.getName() + "\n" +
				"Martikelnummer: " + matriculationNumber + "\n" +
				"E-Mail: " + eMail + "\n" ;
	}
	

	public String getCompleteData() {
		return "Name des Studierenden: " + firstname + " " + name + "\n" +
				"(angestrebter)  Abschluss:  " + courseOfStudies.getTargetFinal() + "\n" +
				"Fach: " + courseOfStudies.getName() + "\n" +
				"Matrikelnummer: " + matriculationNumber + "\n" +
				"E-Mail: " + eMail + "\n" + " -- Pruefungen --\n" +
				courseOfStudies.getCoursesData() +"\n" +
				"Notendurchschnitt: " + String.format("%10.2f", this.getNoteAverage()) + "\n";
	}
	
	public double getNoteAverage(){
		int counter = 0;
		double all = 0;
		for (Course course : courseOfStudies.getCourses()){
			if (course.getNote() != 0){
				all += course.getNote() * course.getMultiplier() * course.getCredit();
				counter += (course.getMultiplier() * course.getCredit());
			}
		}
		return (all/counter);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMatriculationNumber() {
		return matriculationNumber;
	}


	public boolean setMatriculationNumber(String matriculationNumber) {
		
		if (matriculationNumber.length() == 7){
		    for (char c : matriculationNumber.toCharArray())
		    {
		        if (!Character.isDigit(c)) return false;
		    }
	
			this.matriculationNumber = matriculationNumber;
		    return true;	
		}
		System.err.print("Martikelnummer muss 7-stellig und numerisch sein");
		return false;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public CourseOfStudies getCourseOfStudies() {
		return courseOfStudies;
	}


	public void setCourseOfStudies(CourseOfStudies courseOfStudies) {
		this.courseOfStudies = courseOfStudies;
	}
}
