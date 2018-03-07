package assignment;

import java.util.Scanner;

public class Palindrame {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=s.nextLine();
		
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		
		if(String.valueOf(str).compareTo(String.valueOf(str1))==0)
		{
			System.out.println("Palindram");
		}
		
			else
			{
				System.out.println("Not a Palandram");
		}
				
				
	

	}

}
