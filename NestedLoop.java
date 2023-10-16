package com.edu;

public class NestedLoop {

	public static void main(String[] args) {
/*for(int i=1;i<=3;i++) {                              1
	for(int j=1;j<=i;j++) {                            2 2
	//	System.out.println("i="+i+" and j="+j);        3 3 3
		System.out.print(+i+" ");
	}
	System.out.println();
}
	}
*/
		
		int r=3;
		for(int i=1;i<=r;i++) {
			for(int b=1;b<=r-i;b++) {        
				System.out.print(" ");       
			}                                
		  
			for(int j=1;j<=i;j++) {
				System.out.println(i);     //    1
				                           //  2 2
                            			   //3 3 3
				
			//	System.out.print(i+" ");//   1
				                        // 2  2
				                        //3 3 3
			}
			System.out.println();
		}
	}
}