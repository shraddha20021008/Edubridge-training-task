package com.edubridge;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the radius:");
	     float r=sc.nextFloat();
	     double area=r*r*pi;
	     System.out.println("area of circle:"+area);
	}

}
