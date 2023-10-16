package com.edu;

import java.util.Scanner;
class CheckNumber{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter the number:");
	     num=sc.nextInt();
	}
	void outputData(){
		if(num==0) {
			System.out.println("0 is neither positive nor negative");
		}
		else {
		if(num>0) {
	    	 System.out.println(+num+" number is Positive");
	     }
	     else {
	    	 System.out.println(+num+" number is negative");
	     }
	}
}
}
public class NegativePositive {

	public static void main(String[] args) {
    CheckNumber cn=new CheckNumber();
    cn.inputData();
    cn.outputData();
     
     
	}

}
