package com.edu;

import java.util.Scanner;

//Armstrong:the sum of cube of individual digits is equal to given number.(3 digit)
//153:1*1*1+5*5*5+3*3*3
//2digit number square
//4 digit power 4
public class Armstrong {

	public static void main(String[] args) {
		int num,d,result=0, n=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		num = scanner.nextInt();
		
		int orgnum = num;
		
		//to calculate number of digits
		
		while(num>0) {
			n++;
			num = num/10;
		}
		
		//To Check number is armstrong number
		
		num = orgnum;
		
		while(num>0) {  //123>0
			d = num%10; //123%10=3
			result = (int) (result+Math.pow(d, n));
			num = num/10;
		}
		
		if(orgnum == result)
			System.out.println(orgnum+" is Armstrong num");
		else
			System.out.println(orgnum+" is not Armstrong num");

	}

}


