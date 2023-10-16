package com.edubridge;

import java.util.Scanner;

class Employee{
	//variables declared in class is called instance variables
	String name;
	int age;
	float salary;
	char gen;
	
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
	     //name=sc.next();  for single word
	     name=sc.nextLine();//for with the space more than one word
	     
	     System.out.println("Enter age");
	     age=sc.nextInt();
	     
	     System.out.println("Enter salary");
	     salary=sc.nextFloat();
	     
	     System.out.println("Enter gender(M/F)");
	     gen=sc.next().charAt(0); //read char
	     
	    

	
	}
	
	void displayData() {

	     System.out.println("Employee Details");
	     System.out.println("Name="+name);
	     System.out.println("age="+age);
	     System.out.println("Salary="+salary);
	     System.out.println("Gender="+gen);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //create an object and call methods
		Employee e=new Employee();
		e.inputData();
		e.displayData();
		
	}

}
