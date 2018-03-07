package assignment;

public class Hello {
	public static void main(String[] args){
	
String str="anilkumar";
char[] inp=str.toCharArray();

for (int i = 0; i < inp.length; i++) {
	//System.out.println(inp[i]);
	if (inp[i]=='i') {
		System.out.println(inp[i]);
	}
}

	
	
	
/*	private int mid;

	public int binarySearch(int[] inputArr,int key){
		
		int start=0;
		int end=inputArr.length-1;
		                                            
		while(start<+end)
		{
			int mid=(start+end)/2;
			
			if(key=inputArr[mid])
				
			{
				return mid;		
						}
			}
			
			if(key<inputArr[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			return -1;
		
	}
*/
}
