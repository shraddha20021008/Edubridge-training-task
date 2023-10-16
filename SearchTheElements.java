package com.edu;

import java.util.Scanner;

public class SearchTheElements {

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
//			for(int i=0;i<a.length;i++) {
			for(int i:a) {
				//System.out.println(a[i]);//array elements
				System.out.println(i);   //index
			}
			int pos=0;
			System.out.println("Enter an element to search");
			int key=sc.nextInt();
			
			for(int i=0;i<a.length;i++) {
				if(key==a[i]) {
					pos=pos+i;
					break;
				}
			}
			if(pos>0) {
				System.out.println("Successful search ");
				System.out.println(key+" present at position "+(pos+1));
				
			}else {
				System.out.println(key +" not found");
				System.out.println("Unsuccessful search");
			}
	}

}
