package otherPrograms;

public class SumOfDigitsInString {
public static void main(String[] args) {
	String text = "Tes12Le79af65";
char[] charArray = text.toCharArray();
int sum=0;
for (int i = 0; i < charArray.length; i++) {
	if(Character.isDigit(charArray[i]))
	{
		sum=sum+Character.getNumericValue(charArray[i]);
	}
}
System.out.println("Sum of Digits in the String: "+text+"is ->"+sum);

}
}
