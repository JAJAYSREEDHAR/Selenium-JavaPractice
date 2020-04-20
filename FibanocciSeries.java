package otherPrograms;

public class FibanocciSeries {

	public static void main(String[] args) {

		int result = 0;
		int findFibSeries = 6;
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i <= findFibSeries; i++) {
			num1 = num2;
			num2 = result;
			System.out.println(result);
			result = num1 + num2;
		}
	}
}
