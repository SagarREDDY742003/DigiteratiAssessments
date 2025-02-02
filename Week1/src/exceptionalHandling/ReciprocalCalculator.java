package exceptionalHandling;

import java.util.Scanner;
import utility.Constants;

public class ReciprocalCalculator {

	private static void processInput() {
		Scanner sc = new Scanner(System.in);
		try {
			float input = sc.nextFloat();
			float reciprocal = 1 / input;
			System.out.println(reciprocal);
		} catch (java.util.InputMismatchException e) {
			System.out.println(Constants.INVALID_INPUT);
		} catch (ArithmeticException e) {
			System.out.println(Constants.DIVIDED_BY_ZERO);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

	public static void main(String[] args) {
		processInput();
	}
}
