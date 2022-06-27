package odevler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n1=0,n2=1,n3;
		 
			Scanner sc = new Scanner(System.in);
			System.out.println("Give number for range");
			int move = sc.nextInt();
			sc.close();
			System.out.print(n2);
				 for(int i=2;i<move;++i)
				 {    
					n3=n1+n2;    
					  System.out.print(" "+n3);    
					  n1=n2;    
					  n2=n3;    
				}
	}
	

}
