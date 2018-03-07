package assignment;

import java.util.Arrays;

public class thirdhighest
{
	

	public static void main(String[] args) {
	
		
		int array[]={1,20,6,99,10,88,17};
		Arrays.sort(array);
		System.out.println("third highest element in the arraya"+array[array.length-3]);
	}
}
