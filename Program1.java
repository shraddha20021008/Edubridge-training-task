package com.edu;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
        int size;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int a[]=new int[size];
	    System.out.println("enter elements:");
		for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				
			}
	
		System.out.println("Even position of elements present in an array are: ");
			      
	    for (int i = 2; i < a.length; i = i+2){  
			         System.out.print(a[i]+" ");  
			      }  
			   }
			
	}


