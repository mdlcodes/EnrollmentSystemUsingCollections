package stu;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private String name;
	private Set<String> setOfCourses = new HashSet<>();
	
	public Student(String name, Set<String> courses) {
		this.name = name;
		this.setOfCourses = courses;
	}
	
	public String getName() {
		return name;
	}
	
	public Set<String> getCourse() {
		return setOfCourses;
	}
	
	public void setCourse(String course) {
		setOfCourses.add(course);
	}
}
