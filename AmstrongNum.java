package otherPrograms;

public class AmstrongNum {

	public static void main(String[] args) {
		int result = 0;
		int findAmsRes = 370;
		int temp = findAmsRes;
		for (; findAmsRes!=0;) {
			result = result + (int) (Math.pow(findAmsRes % 10, 3));
			// System.out.println(result);
			findAmsRes = findAmsRes / 10;

		}

		if (result == temp) {
			System.out.println(temp + "is an Amstrong Number");
		} else {
			System.out.println(temp + "is not a Amstrong Number");
		}

	}

}
