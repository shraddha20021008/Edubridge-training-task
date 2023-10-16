package com.edu;

import java.util.Scanner;

class ThreeNumber{
	int num1,num2,num3;
	void inputData() {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the numbers:");
	     num1=sc.nextInt();
	     num2=sc.nextInt();
	     num3=sc.nextInt();

	}
	void outputData(){
		
		if(num1>num2 && num1>num3) {
	    	 System.out.println("Largest Number is "+num1);
	     }
		else if(num2>num1 && num2>num3){
	    	 System.out.println("Largest Number is "+num2);
	     }
	    	 else {
	    		 System.out.println("Largest Number is "+num3);
	    	 }
	}
}


public class Largest3 {

	public static void main(String[] args) {
		ThreeNumber cn=new ThreeNumber();
	    cn.inputData();
	    cn.outputData();
	}

}
