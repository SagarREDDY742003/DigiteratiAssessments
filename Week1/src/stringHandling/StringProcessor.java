package stringHandling;

import java.util.Scanner;

public class StringProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String sub = sc.next();
		sc.close();
		System.out.println("ReverseString: " + reverseString(input));
		System.out.println("Number of ocurrences: " + countOccurrences(input, sub));
		System.out.println("Number of ocurrences: " + splitAndCapitalize(input));

	}

	public static String splitAndCapitalize(String input) {
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (word.length() > 0) {
				sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
			}
		}
		return sb.toString().trim();
	}

	public static int countOccurrences(String input, String sub) {
		int count = 0;
		int index = 0;
		if (input == null || sub == null || sub.isEmpty())
			return 0;
		while ((index = input.indexOf(sub, index)) != -1) {
			count++;
			index += sub.length();
		}
		return count;
	}

	public static String reverseString(String input) {
		return new StringBuilder(input).reverse().toString();
	}

}
