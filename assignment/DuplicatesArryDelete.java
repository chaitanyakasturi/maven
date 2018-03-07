package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesArryDelete 
{
	public static void main (String args[])
	{	
int array[]={1,1,2,3,4,2,3,1,4,2,4,3};
sort(array);
	}


	private static void sort(int[] array) {
		// TODO Auto-generated method stub
	
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:array)
		{
			list.add(i);
		}
		Set<Integer> set=new LinkedHashSet<Integer>(list);
		for(Integer integer:set)
		{
			System.out.println(integer + " ");
		}
		
	}

}
