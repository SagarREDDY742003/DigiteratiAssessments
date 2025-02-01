package programs;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		System.out.println("TrailingZeros:" + countTrailingZeros(number));
	}

	// Method to find number of trailing zeroes in the factorial of a given number
	public static int countTrailingZeros(int number) {
		int noOfFives = 0;
		int tempNum = 5;
		// check whether given number is greater than tempNum or not
		while (number > tempNum) {
			// add quotient to the noOfFives
			noOfFives += number / tempNum;
			// multiply tempNum by 5
			tempNum *= 5;
		}
		return noOfFives;
	}
}
