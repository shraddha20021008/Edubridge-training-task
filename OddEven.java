package com.edu;

import java.util.Scanner;

class Check{
	int num;
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
	}
	void display() {
		/*if(num%2==0) {
			System.out.println(+num+ "Number is Even");
		}
		else {
			System.out.println(+num+"Number is odd");
		}*/
		
		switch(num%2) {
		case 1:System.out.println("Number is odd"); 
		       break;
		case 0:System.out.println("Number is Even");
		       break;

		}
			
	}
}
public class OddEven {

	public static void main(String[] args) {
	Check c=new Check();
	c.inputData();
	c.display();
	

	}

}
