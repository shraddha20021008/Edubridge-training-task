package com.edu;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String:");
     String str=sc.nextLine();
    System.out.println(str.toLowerCase()+" String in Lowercase:");
    System.out.println(str.toUpperCase()+" String in Uppercase:"); 
    System.out.println(str.trim()+" String without first and last space:"); 
    System.out.println( str.startsWith("sit")+" String start with sit:"); 
    System.out.println( str.endsWith("college")+" String end with college:"); 
    System.out.println( str.charAt(0)+" Char at 0 index:"); 
    System.out.println(str.length()+" Length of string");
    System.out.println(str.replace(" sit", "dkte"));
    System.out.println(str.intern()+str);
    System.out.println(str.toCharArray());
     
	}

}
