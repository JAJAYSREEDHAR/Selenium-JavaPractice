package otherPrograms;

public class VerifyPrimeNum {

	public static void main(String[] args) {

		int checkPrimeNum = 41;
		boolean isPrime = true;
		for (int i = 2; checkPrimeNum <= checkPrimeNum / 2; i++) {
			if (checkPrimeNum % i == 0) {
				System.out.println(checkPrimeNum % i);

				isPrime = false;

				break;
			}

		}
		if (isPrime) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}
	}

}
