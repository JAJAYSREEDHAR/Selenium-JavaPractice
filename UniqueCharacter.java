package otherPrograms;

import java.util.Arrays;

public class UniqueCharacter {

	public static void main(String[] args) {
		String txt = "Amazon";
		String lowerCase = txt.toLowerCase();
		int count = 0;
		char[] charArray = lowerCase.toCharArray();
		Arrays.sort(charArray);
		for (int i = 1; i < charArray.length; i++) {

			if (charArray[i] != charArray[i - 1]) {
				count++;
			}
		}
		System.out.println("Count of unique character's is" + count);

	}

}
