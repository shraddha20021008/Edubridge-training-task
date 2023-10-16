package com.edu;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
	int a[]=new int[5];
	//for(int i=0;i<a.length;i++) {
	//	System.out.println(a[i]);
//	}
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter "+a.length+" elements");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("Array elements are ");	
//	for(int i=0;i<a.length;i++) {
	for(int i:a) {
		//System.out.println(a[i]);//array elements
		System.out.println(i);   //index
	}
	}

}
