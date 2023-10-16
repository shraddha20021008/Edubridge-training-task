package edubridge;
//order 
//package
//import
//class
/*
 * Methods of scanner class
 * nextByte(),nextShort(),nextDouble(),nextInt(),nextFloat(),next(),nextLine()
 */
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int age;
     String name;
     float salary;
     char gen;
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name");
     //name=sc.next();  for single word
     name=sc.nextLine();//for with the space more than one word
     
     System.out.println("Enter age");
     age=sc.nextInt();
     
     System.out.println("Enter salary");
     salary=sc.nextFloat();
     
     System.out.println("Enter gender(M/F)");
     gen=sc.next().charAt(0); //read char
     
     System.out.println("Employee Details");
     System.out.println("Name="+name);
     System.out.println("age="+age);
     System.out.println("Salary="+salary);
     System.out.println("Gender="+gen);





     
     
     
	}

}
