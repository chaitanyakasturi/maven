//create a package for our project
//import java.utils
//create an  class for 




package assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int i,n = 5,fact=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value to calculate factorial");
		//n=s.nextInt();
		
    for(i=1;i<=n ;i++)
{
	fact=fact*i;
	
	//System.out.println("Factorial number is:"+fact);
}
    System.out.println("Factorial number is:"+fact);
	}

}
