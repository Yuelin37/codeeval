/*SUM OF PRIMES
CHALLENGE DESCRIPTION:

Write a program to determine the sum of the first 1000 prime numbers.

INPUT SAMPLE:

There is no input for this program.

OUTPUT SAMPLE:

Your program should print the sum on stdout, i.e.

3682913*/


package sumOfPrimes;

public class Main {

	public static void main(String[] args) {
		int curNumber = 2;
		int sum = 0;
		boolean isPrime = true;
		int counter = 1;
		while (counter <= 1000) {

			int half = curNumber / 2;
			for (int j = 2; j <= half; j++) {
				// System.out.println(curNumber + "%" + j + " = " + curNumber % j);
				if (curNumber % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
//				System.out.println(curNumber);
				sum += curNumber;
				counter++;
			}
			curNumber++;
			isPrime = true;
		}
		System.out.println(sum);
	}

}
