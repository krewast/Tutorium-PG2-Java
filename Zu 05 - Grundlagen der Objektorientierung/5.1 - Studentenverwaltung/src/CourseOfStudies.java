package de.oth.pg2.qis;

import java.util.ArrayList;
import java.util.List;

public class CourseOfStudies {

	private List<Course> courses = new ArrayList<Course>();
	private String name;
	private String targetFinal;
	
	public CourseOfStudies(List<Course> courses, String name, String targetFinal) {
		this.courses = courses;
		this.name = name;
		this.targetFinal = targetFinal;
	}

	public CourseOfStudies() {
		
	}

	public String getCoursesData() {
		String returnCoursesData = "";
		for (Course course : courses){
			returnCoursesData += course.getCourseData() + " -- -- \n";
		}
		return returnCoursesData;
	}
	

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course){
		this.courses.add(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTargetFinal() {
		return targetFinal;
	}

	public void setTargetFinal(String targetFinal) {
		this.targetFinal = targetFinal;
	}
	
}
