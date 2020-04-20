package otherPrograms;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// Second Largest 
		int[] data= {2,3,7,5,8,9};
		Arrays.sort(data);
  
		for (int i = 0; i < data.length; i++) {
			
			//System.out.println(data[i]);
		}
		int  count= data.length;
		
		System.out.println(data[count-2]);
		
		

	}

}
