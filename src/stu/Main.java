package stu;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Student> students = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Do you want to enroll a student? ");
		System.out.println("1: Yes \n2: No");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1: proceed();
				break;
		case 2: System.out.println("Exiting program...");
				break;
		default: break;
		}
	}
	
	public static void proceed() {
		int numOfStudent = 0;
		boolean valid = false;
		try {
			
			while(!valid) {
			System.out.println("Enter number of students: ");
			numOfStudent = sc.nextInt();
			sc.nextLine();
			
			if(numOfStudent <= 0) {
				System.out.println("Number of Student cannot be zero or negative.");
			} else {
				valid = true;
			}
			
			
			}
			for(int i = 1; i <= numOfStudent; i++) {
				System.out.println("Enter Student name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter number of courses: ");
				int numOfCourses = sc.nextInt();
				sc.nextLine();
				
				List<String> tempCourse = new ArrayList<>();
				
				for(int j = 1; j <= numOfCourses; j++) {
					System.out.println("Enter the name of course " + j + ": ");
					String course = sc.nextLine();
					tempCourse.add(course);
				}
				
				Set<String> noDupCourse = new HashSet<>(tempCourse);
				Student student = new Student(name, noDupCourse);
                students.add(student);
			}
			
			System.out.println("Do you want to display enrolled Student? ");
			System.out.println("1: Yes \n2: No");
			int displayChoice = sc.nextInt();
			
			
			switch(displayChoice) {
			case 1: displayAllStudents();
					break;
			case 2: System.out.println("Thank you for enrolling student!");
					break;
			default: System.out.println("Invalid input!");
			break;
			}
		}catch(InputMismatchException ime) {
			System.err.println("Invalid Input! ");
			}
		
		
	}
	public static void displayAllStudents() {
            for(int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println("\nStudent " + student.getName());
                System.out.println("Courses: " + student.getCourse());
            }
        }
    }


