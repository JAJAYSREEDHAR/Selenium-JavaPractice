package otherPrograms;

public class ShiftLeft {

	public static void main(String[] args) {
		String st = "ajay Sreedhar";
		char ch[] = st.toCharArray();
		int n = ch.length;
//define n to Shift left by n times
		String s = "";
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < ch.length; j++) {
				s = s + ch[j];

			}

			ch = s.toCharArray();
			System.out.println("test-->" + s);

			s = "";

		}
	}

}
