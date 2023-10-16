package com.edu;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		  int[] a = new int[10];
		  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the size :");
	        int size = sc.nextInt();
	        System.out.println("Enter the elements:");
	        for(int i=0; i<size; i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        System.out.println("Array Elements Before Deletion");
	        for(int i=0; i<size; i++)
	        {
	            System.out.println(a[i] + " ");
	        }
	        System.out.println("Enter the position where the element should be inserted");
	        int pos = obj.nextInt();
	        for(int i=pos; i<size; i++)
	        {
	            a[i] = a[i+1];
	        }
	        --size;
	        System.out.println("Array Elements After Deletion");
	        for(int i=0;i<size;i++)
	        {
	            System.out.println(a[i] + " ");
	        }
	    }
	
		    }
		


