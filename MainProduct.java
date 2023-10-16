package com.edubridge;

import java.util.Scanner;

class Product{
	int pid;
	String pname;
	float pprice;
	static String cname="Wipro";

void inputProduct() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter pname");
	pname= scanner.nextLine();
	
	System.out.println("Enter pid");
	pid=scanner.nextInt();
	
	
	System.out.println("Enter pprice");
	pprice= scanner.nextFloat();
	
	
}
void displayProduct() {
	System.out.println("Product id="+this.pid);
	System.out.println("Product name="+this.pname);
	System.out.println("Price=Rs "+this.pprice);
	System.out.println("Company Name="+this.cname);

}}
public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();

		p1.inputProduct();
		p2.inputProduct();
		p3.inputProduct();
		p4.inputProduct();
		p5.inputProduct();

		
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		p4.displayProduct();
		p5.displayProduct();
	}

}
