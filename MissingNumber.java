package otherPrograms;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// missing number
		int[] data = { 1, 2, 3, 4, 7};

		Arrays.sort(data);
		int count = data.length;
		int adjustCount = 0;
		for (int i = 1; i <= count; i++) {
			
			if (data[i - 1] != i) {
				
				System.out.println("Missing no" + i);
				adjustCount=adjustCount+1;
				
				count = count + adjustCount;

			}
			

		}
		System.out.println("Adjusted count is"+adjustCount);
	}

}
