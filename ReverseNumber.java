package com.edu;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number to reverse ");

		int a=sc.nextInt();

		int rev=0;

		while(a!=0){

		            int digit = a % 10;

		            rev = rev * 10 + digit;

		            a=a/10;

		        }

		System.out.println("Reversed number is= "+rev);

	
	}

}
