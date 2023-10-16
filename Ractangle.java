package com.edubridge;
import java.util.Scanner;
public class Ractangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the length:");
     int l=sc.nextInt();
     System.out.println("Enter the breadth:");
     int b=sc.nextInt();
     int area=l*b;
     System.out.println("area of rectangle:"+area);
	}

}
