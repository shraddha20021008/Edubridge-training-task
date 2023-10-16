package com.edu;

import java.util.Scanner;

public class GradeMarks {
	char Grade;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grade:");
		Grade=sc.next().charAt(0);
	}
    void CheckGrade() {
    	if(Grade=='A' || Grade=='B' ||Grade=='C' ||Grade=='F') {
    	if(Grade=='A' || Grade=='a') {
    		System.out.println("Your marks in between 80 to 100");
    	}
    	else if(Grade=='B' || Grade=='b'){
    	System.out.println("Your marks in between 60 to 79");	
    	}
    	else if(Grade=='C' || Grade=='c'){
        	System.out.println("Your marks in between 40 to 59");	
        	}
    	else if(Grade=='F' || Grade=='f'){
        	System.out.println("Your marks in between 0 to 39");	
        	}
    }
    	else {
    		System.out.println("Invalid Input");
    	}
    }
	public static void main(String[] args) {
	GradeMarks gm=new GradeMarks();
	gm.inputData();
	gm.CheckGrade();
	}

}
