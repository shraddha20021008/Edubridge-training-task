package com.edu;

import java.util.Scanner;

class Calculator{
	double n1,n2,ans;
	static Scanner sc=new Scanner(System.in);
	void inputData() {
	
		System.out.println("enter two numbers:");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
	}
	void addition() {
		ans=n1+n2;
		System.out.println("The sum of "+n1+" and "+n2+" is "+ans);
	}
	void substraction() {
		ans=n1-n2;
		System.out.println("The substraction of "+n1+" and "+n2+" is "+ans);
	}
	void multiplication() {
		ans=n1*n2;
		System.out.println("The Multiplication of "+n1+" and "+n2+" is "+ans);
	}
	void division() {
		if(n2==0) {
			System.out.println("Divide by zero error");
		}else {
		ans=n1/n2;
		System.out.println("The division of "+n1+" and "+n2+" is "+ans);
	}
}
}
public class SwitchCase {
	
	

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("************My MENU***********");
        System.out.println("Enetr your choice");
        System.out.println("1.for addition");
        System.out.println("2.for substraction");
        System.out.println("3.for multiplication");
        System.out.println("4.for division");
        int choice=Calculator.sc.nextInt();
        
        cal.inputData();
        
        switch(choice) {
        case 1:cal.addition();
               break;
        case 2:cal.substraction();
               break;
        case 3:cal.multiplication();
               break;
        case 4:cal.division();
               break;
        default:System.out.println("default choice");
                break;
        }
	}

}
