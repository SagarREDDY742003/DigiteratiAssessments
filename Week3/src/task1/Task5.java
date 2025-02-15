package task1;

import java.util.Scanner;

//Task 5 : You are required to create a string and capitalize every alternative character.
public class Task5 {

	public static void altCapatilize(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i % 2 == 0) {
				result.append(Character.toUpperCase(c));
			} else {
				result.append(c);
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		altCapatilize(str);
		sc.close();
	}

}
