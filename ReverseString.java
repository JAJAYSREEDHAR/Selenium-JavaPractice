package otherPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String txt = "Ajay";
		String txt1 = "";
		char[] charArray = txt.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			txt1+= charArray[i];					}
		System.out.println(txt1);

	}
}
