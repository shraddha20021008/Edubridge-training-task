package com.edu;

import java.util.Scanner;

public class Pro2 {

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
		System.out.println("Array elements are ");	
//		for(int i=0;i<a.length;i++) {
		for(int i:a) {
			//System.out.println(a[i]);//array elements
			System.out.println(i);   //index
		}
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println("Sum ="+sum);
		float avg=0;
		avg=(float)sum/a.length;
		System.out.println("Average ="+avg);
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Largest of all array elements "+max);
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("smallest element is "+min);
	
	}



	
	
	}

