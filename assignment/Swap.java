package assignment;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		{
			int x,y,z;
			System.out.println("Enter x and y");
			
			Scanner sc=new Scanner(System.in);
			
			x=sc.nextInt();
			y=sc.nextInt();
			z=x;
			x=y;
			
			y=z;
			System.out.println("Swaping two numbers:\nx="+x+"\ny="+y);
			
			
			
		}

	}

}
