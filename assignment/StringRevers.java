package assignment;

import java.io.BufferedReader;
import java.util.Scanner;

public class StringRevers {

	public static void main(String[] args) {
		
		String Orginal="11th hour chiselon";
		//Alocating memory to assgined string to stringBuilder
		StringBuilder rev= new StringBuilder();
		
		//append a string into string builder
		rev.append(Orginal);
		
		//to revers a Stringbuilder
		rev.reverse();
		
		//find the length of the string
		int len=Orginal.length();
		
		//print revers string
		for(int i=0;i<len;i++)
		{
			
			System.out.print(rev.charAt(i));
		}

/*        Scanner s=new Scanner(System.in);
       // BufferedReader br=new BufferedReader(br);
		
		System.out.println("Enter String");
		String str=s.nextLine();//kumar
		String rev="";
		int count=str.length();//4
		for (int i = count-1; i >=0; i--) {
			String rev=rev + charAt(i);//ramuk
			}
		*/
		/*	
		String actual_result=driver.
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		System.out.println("Reverse String is :"+str1);*/
		
	}

}
