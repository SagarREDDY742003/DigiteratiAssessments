package programs;

import java.util.Scanner;
import utility.Utility;

public class LengthOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		// Call the static method from the Utility class and print length
		System.out.println("Length:" + Utility.getLength(number));
	}

}
