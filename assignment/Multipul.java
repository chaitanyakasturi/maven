package assignment;

import java.util.Scanner;

public class Multipul {

	public static void main(String[] args) {
		String Firstname="Kasturi";
		String Lastname="chaitanya";
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter values of inbetween 1 to 100");
		int a=s.nextInt();
		if(a%3==0&&a%5==0)
		{
			System.out.println("Full name is :"+Firstname + Lastname);
		}
			else
			{
				if(a%5==0)
				{System.out.println("LastName is"+Lastname);
				}
				else if(a%3==0)
				{
					
					System.out.println("FirstName is"+Firstname);
				}
				else
				{
					System.out.println("Number is not multipuls of 3and5");
				}
			
			}
		
		}
			
		
		

	

}
