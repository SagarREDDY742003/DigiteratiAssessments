package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculateAverage {

	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,10,44,23,11,8));
		double average = (double)(arrlst.stream().reduce(0,(s,t)->s+t))/arrlst.size();
		System.out.println(average);
	}

}
