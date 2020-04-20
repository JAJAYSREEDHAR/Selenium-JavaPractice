package otherPrograms;

public class PrintType {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
char[] charArray = test.toCharArray();
int digitsCount=0;
int specialCharCount=0;
int letterCount=0;
int spaceCount=0;
for (int i = 0; i < charArray.length; i++) {
if(!(Character.isDigit(charArray[i]) || Character.isSpace(charArray[i]) || Character.isLetter(charArray[i])))
{
specialCharCount++;
}
else if (Character.isDigit(charArray[i])) {
	digitsCount++;
}
else if (Character.isSpace(charArray[i])) {
	spaceCount++;
}
else if (Character.isLetter(charArray[i])) {
	letterCount++;
}


}
System.out.println("No of digits -->"+digitsCount+" ,No of Spaces --> "+spaceCount+" ,No of Letters -->"+letterCount+" ,No of Special symbols -->"+specialCharCount);
	}

}
