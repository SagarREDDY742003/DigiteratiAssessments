package generics;

import java.util.List;

//Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

public class SumEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		System.out.println(sumEven(numbers));
		System.out.println(sumOdd(numbers));
	}

	private static <T> int sumEven(List<T> numbers) {
		int sum=0;
		for (T num : numbers) {
            if ((int)num % 2 == 0) {
                sum += (int)num;
            } 
        }
		return sum;
	}
	private static <T> int sumOdd(List<T> numbers) {
		int sum=0;
		for (T num : numbers) {
            if ((int)num % 2 != 0) {
                sum += (int)num;
            } 
        }
		return sum;
	}

}
