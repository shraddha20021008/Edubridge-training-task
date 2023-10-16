package com.edu;

import java.util.Scanner;

class fact{
	long num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
	}
	void check() {
		long fact=1;
		for(long i=num;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}

public class Factorial {

	public static void main(String[] args) {
  fact f=new fact();
  f.inputData();
  f.check();
	}

}
