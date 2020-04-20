package otherPrograms;

public class AmstrongNumsInRange {

	public static void main(String[] args) {
		int result;
		int findAmsRes;

		int endNum = 1500;
		for (int i = 1; i <= endNum; i++) {
			result = 0;
			for (findAmsRes = i; findAmsRes != 0;) {
				result = result + (int) (Math.pow(findAmsRes % 10, 3));
				// System.out.println(result);
				findAmsRes = findAmsRes / 10;

			}
			if (result == i) {
				System.out.println(i + " is an Amstrong Number");

			}

		}

	}

}
