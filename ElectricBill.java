package com.edu;

import java.util.Scanner;

class Electric{
	String s;
	int u;
	double b;
	void accept() {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Name of the Customer:");
	    s=sc.nextLine();
	    System.out.println("Enter Number of unit consumed:");
	    u=sc.nextInt();
	}
	void calculate() {
		if(u>=0 && u<=100) {
			b=u*2.00f;
			}
		else if(u>100 && u<=200) {
			b=100*2.00f+(u-100)*3.00f;
		}
		else if(u>300) {
			b=100*2.00f+100*3.00f+((u-200)*5.00f)*0.025;
		}
		
	}
	void print() {
		 System.out.println("Name of the Customer:"+s);
		    System.out.println("Number of unit consumed:"+u);
		    System.out.println("Bill amount:"+b);


	}
}
public class ElectricBill {

	public static void main(String[] args) {
		Electric e=new Electric();
		e.accept();
		e.calculate();
		e.print();
		
		

	}

}
