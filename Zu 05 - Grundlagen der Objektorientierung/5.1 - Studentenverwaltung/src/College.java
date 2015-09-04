package de.oth.pg2.qis;

import java.util.ArrayList;
import java.util.List;

public class College {

	private List<Student> students = new ArrayList<Student>();
	private List<CourseOfStudies> coursesOfStudies = new ArrayList<>();
	private String name;
	
	public College(String name) {
		this.name = name;
	}
	
	public String getAllBaseData(){
		String returnBaseData = "";
		for (Student student : students){
			returnBaseData += student.getBaseData() + "---------\n";
			
		}
		return returnBaseData;
	}
	public String getAllCompleteData(){
		String returnAllCompleteData = "";
		for (Student student : students){
			returnAllCompleteData += student.getCompleteData() + "---------\n";
			
		}
		return returnAllCompleteData;
	}
	

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CourseOfStudies> getCoursesOfStudies() {
		return coursesOfStudies;
	}

	public void setCoursesOfStudies(List<CourseOfStudies> coursesOfStudies) {
		this.coursesOfStudies = coursesOfStudies;
	}
	
	public void addCoursesOfStudies(CourseOfStudies coursesOfStudie){
		this.coursesOfStudies.add(coursesOfStudie);
	}

	public String getBaseData() {
		String courseOfStudiesString = "\n";
				
		for (CourseOfStudies courseOfStudies : coursesOfStudies){
			courseOfStudiesString += "[" + courseOfStudies.getName() + " ("
					+ courseOfStudies.getTargetFinal() + ")]\n";
		}
		

		return "Name: " + this.name + courseOfStudiesString;
	}
	
	
}
