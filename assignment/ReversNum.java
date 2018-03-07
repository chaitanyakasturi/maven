package assignment;

import java.util.Scanner;

public class ReversNum {

	public static void main(String[] args) {
		int n,r=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ReversNumber");
		
		n=s.nextInt();
		
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
			
		}
		System.out.println("Revers number is :"+r);
		

	}

}
