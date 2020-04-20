package otherPrograms;

import java.util.Arrays;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] data= {5,2,2,8,7,7};
		Arrays.sort(data);
		for (int i =1 ; i < data.length; i++) {
		if (data[i-1]==data[i])
			
			
		{
			System.out.println(data[i]);
		
			
		}
		}
				
	}

}
