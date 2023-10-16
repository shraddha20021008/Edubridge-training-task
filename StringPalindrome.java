package com.edu;

import java.util.Scanner;
//Java Program to implement
//Basic Approach to check if
//string is a Palindrome
import java.io.*;


class StringPalindrome {
	
	public static boolean isPalindrome(String str)
	{
		
		String rev = "";

		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String str=sc.nextLine();

		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}
