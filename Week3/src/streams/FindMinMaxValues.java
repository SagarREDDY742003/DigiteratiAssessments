package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinMaxValues {

	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,2,13,4,5,6));
		OptionalInt minValue = arrlst.stream().mapToInt(Integer::intValue).min();
		System.out.println("Minimum Valie:"+minValue);
		OptionalInt maxValue = arrlst.stream().mapToInt(Integer::intValue).max();
		System.out.println("Maximum Valie:"+maxValue);
	}

}
