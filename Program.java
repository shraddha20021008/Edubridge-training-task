package com.edu;

public class Program {

	public static void main(String[] args) {
		
int num=123786;
int n=0;
//for(;num>0;num=num/10,n++) {
//	}
//System.out.println(n);
while(num>0) {
	n++;
	num=num/10;
}
System.out.println("count of digit"+n);
}
}
