package com.edu;

public class ArrayExample {

	public static void main(String[] args) {
	int []mark1= {10,20,30};
	int []mark2= {5,20,40};
	int []mark3=new int[3];
	for(int i=0;i<mark3.length;i++) {
		mark3[i]=mark1[i]+mark2[i];
	}
	for(int i=0;i<mark3.length;i++) {
	System.out.print(mark3[i]+" ");
	}

}
}
