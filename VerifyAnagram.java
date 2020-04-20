package otherPrograms;

import java.util.Arrays;

public class VerifyAnagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		boolean isAnagram = true;
		if (text1.length() == text2.length()) {
			Arrays.sort(charArray);
			Arrays.sort(charArray2);

			if (Arrays.equals(charArray, charArray2)) {
			} else {
				isAnagram = false;
			}

		} else {
			isAnagram = false;
		}

		if (isAnagram) {
			System.out.println(text1 + " and " + text2 + " are Anagrams");
		} else {
			System.out.println(text1 + " and " + text2 + " are not Anagrams");
		}
	}

}
