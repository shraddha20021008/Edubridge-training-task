package com.edu;

import java.util.Scanner;

public class MarksGrade {
	int m;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		m=sc.nextInt();
	}
	void CheckMarks() {
		if(m<0 || m>100) {
			System.out.println("Invalid input");
		}
		else if(m>=80 && m<=100) {
			System.out.println("Grade A");
		}
		else if(m>=60 && m<=79) {
			System.out.println("Grade B");
		}
		else if(m>=40 && m<=59) {
			System.out.println("Grade C");
		}
		else if(m>=0 && m<=39){
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
	MarksGrade mg=new MarksGrade();
	mg.inputData();
	mg.CheckMarks();
	}

}
