package com.edu;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

		System.out.println("Enter the number");

		int n=sc.nextInt();

		int rev=n;

		int sum=0;

		while (n>0) {

		int temp=n%10;

		sum=sum*10+temp;

		n/=10;

		}

		if ( sum==rev) {

		System.out.println("the givn number is palindrome");

		}

		else

		{

		System.out.println("the givn number is NOT palindrome");


		}


	}

}
