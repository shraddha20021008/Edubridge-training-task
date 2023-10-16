package com.edubridge;

import java.util.Scanner;

class Student{
	int age;
	String name;
	
	static String collegename="Sharad institute of Technology college of enginnerring";
	
	void inputStudentData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		name=scanner.nextLine();
		
		System.out.println("Enter Age");
		age = scanner.nextInt();
	}
	void displayStudentData() {
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);
		System.out.println("College name="+this.collegename);


	}
public class StudentMakimnApp {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2= new Student();

		student1.inputStudentData();
		student2.inputStudentData();
		
		student1.displayStudentData();
		student2.displayStudentData();
		

		
		/*System.out.println("Name = "+student1.name); 
		System.out.println("Age = "+student1.age);
		//System.out.println("college Name = "+student.collegename);
		System.out.println("college Name = "+student1.collegename);
*/
	}
		// TODO Auto-generated method stub

	}

}
