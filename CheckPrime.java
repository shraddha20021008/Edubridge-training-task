package com.edu;

public class CheckPrime {

	public static void main(String[] args) {
	int i,j,flag=0;
	int n=8;
	for(i=2;i<n%2;i++) {
		if(n%i==0) {
			flag=1;
		}
		
	}
	if(flag==1) {
		System.out.println(n+"Number is not prime Number");
	}
	else {
		System.out.println(n+"Number is  prime Number");	
	}
	}

}
