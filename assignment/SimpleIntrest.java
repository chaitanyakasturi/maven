package assignment;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		

	 int p;double r;int t;
		
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the  priniciple: ");
		p=s.nextInt();
		
		System.out.println("Enter the  Rate of Intrest: ");
		r=s.nextInt();
		
		System.out.println("Enter the time period: ");
		t=s.nextInt();
		
		
		double si=(p*r*t)/100;
		
		System.out.println( si);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
