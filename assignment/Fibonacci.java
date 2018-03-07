package assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a =0,b=1,c=1,n,i;
		System.out.println("Enter n value");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		
		System.out.println("Print Fibonacci");
		
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
		}
			
		

		
		
		
		
		
	}

}
