package com.edu;

import java.util.Scanner;

public class Fibonacci {
   
	public static void main(String[] args) {
    int n,num1=1,num2=1,num3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the terms:");
	n=sc.nextInt();
	
	System.out.println("Fibonacci series:");
	System.out.print(num1+" "+num2+" ");
	
	for(int i=1;i<=n;i++) {
		num3=num1+num2;
		System.out.print(num3+" ");
		num1=num2;
		num2=num3;
	}
	}

}
