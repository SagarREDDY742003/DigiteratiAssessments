package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEveOdd {

	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,11,44,23,11,8));
		int sumOfEvenNumbers = arrlst.stream().filter(s->(s%2==0)).reduce(0,(s,t)->s+t);
		System.out.println("sumOfEvenNumbers: "+sumOfEvenNumbers);
		int sumOfOddNumbers = arrlst.stream().filter(s->(s%2!=0)).reduce(0,(s,t)->s+t);
		System.out.println("sumOfOddNumbers : "+sumOfOddNumbers);

	}

}
