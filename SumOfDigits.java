package otherPrograms;

public class SumOfDigits {

	public static void main(String[] args) {

		
		int sum=0;
		for(int num=123;num%10!=0;)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		}

}
