package com.edu;

import java.util.Scanner;

class AreaAll{
	double area;
	public double areasquare(double side) {
		area=side*side;
		return area;
	}
	public double arearectangle(double l,double b) {
		area=l*b;
		return area;
	}
	public void areacircle(double r) {
		area=3.14159f*r*r;
		System.out.println("Area of circle="+area);
	}
	public void areatriangle(double base,double height) {
		area=(base*height)/2;
		System.out.println("Area of triangle="+area);
	}
}

public class Area {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

AreaAll a=new AreaAll();
System.out.println("MENU area of different figures");
System.out.println("Enter your choice");
System.out.println("1.Rectangle");
System.out.println("2.Square");
System.out.println("3.Circle");
System.out.println("4.Triangle");

int choice=sc.nextInt();

switch(choice) {
case 1:System.out.println("Enter the length and breadth of rectangle");
       l=sc.nextDouble();
       b=sc.nextDouble();
       double arearect=a.arearectangle(l, b);
		System.out.println("Area of rectangle="+arearect);
		break;
case 2:System.out.println("Enter the length of side");
       side=sc.nextInt();
       

       
       }
	}

}
