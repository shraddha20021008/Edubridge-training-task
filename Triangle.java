package com.edubridge;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the base:");
	     int b=sc.nextInt();
	     System.out.println("Enter the height:");
	     int h=sc.nextInt();
	     int area=(b*h)/2;
	     System.out.println("area of triangle:"+area);
	}

}
