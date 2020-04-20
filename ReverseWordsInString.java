package otherPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {

/*		1.input String str="I AM turning into a Programmer"
		2. expected = "I MA gninrut otni a remmargorp"
		3. Steps 
		3.1. Read the String
		3.2. split the String into String Array
		3.3. Iterate & use String Buffer's reverse method to reverse the Strings
		3.4. take an empty string & append the reversed strings*/
		String expected="";
String input="I Am converting to 1Developer";
String[] split = input.split(" ");

for (int i = 0; i < split.length; i++) {
	StringBuffer sb= new StringBuffer(split[i]);
	expected =expected+sb.reverse().toString()+" ";
	
	}
	System.out.println(expected);	
	}

}
