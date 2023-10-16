package com.edu;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		 int temp;
		 int[] array = new int[10];
		  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the size :");
	        int size = sc.nextInt();
	        System.out.println("Enter the elements:");
	        for(int i=0; i<size; i++)
	        {
	            array[i] = sc.nextInt();
	        }
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("second largest number is:: "+array[size-2]);
	   }
	
	}


