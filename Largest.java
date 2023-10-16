package com.edu;

import java.util.Scanner;

class Number{
	int num1,num2;
	void inputData() {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the numbers:");
	     num1=sc.nextInt();
	     num2=sc.nextInt();
	}
	void outputData(){
		
		if(num1>num2) {
	    	 System.out.println("Largest Number is "+num1);
	     }
	     else {
	    	 System.out.println("Largest Number is "+num2);
	     }
	}
}



public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Number cn=new Number();
		    cn.inputData();
		    cn.outputData();
	}

}
