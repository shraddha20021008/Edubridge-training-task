package com.edu;

public class Multidimensional {

	public static void main(String[] args) {
	int array[][]= {{10,20,30},{40,50,60},{70,80,90}};
	int copy[][]=array.clone();
	for(int i=0;i<array.length;i++) {
		System.out.println(" ");
		for(int j=0;j<array[i].length;j++){
			System.out.print(" "+copy[i][j]);
		}
	}
	}

}
