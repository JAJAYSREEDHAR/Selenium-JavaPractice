package otherPrograms;

import java.util.Arrays;

public class charOccurance {

	public static void main(String[] args) {
		String txt = "ajay sreedhar";

		char[] charArray = txt.toCharArray();
		int len = charArray.length;
		for (int i = 0; i < len; i++) {

			int count = 1;
			for (int j = i+1; j < len; j++) {

				if (charArray[i] == charArray[j]) {
					count++;
						for (int k = j; k < len-1	; k++) {
						charArray[k] = charArray[k+1];
					//	System.out.println(charArray);
												}
						j--;
						len--;
				}
			}
		    System.out.println(charArray[i]+"="+count);

		}

	}
}