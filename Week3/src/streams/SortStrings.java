package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortStrings {

	public static void main(String[] args) {
		ArrayList<String> arrlst = new ArrayList<>(Arrays.asList("Sagar","Reddy","Dinesh","Sai Hari","Sagar"));
		System.out.println(arrlst);
		ArrayList<String> ascending = (ArrayList<String>) arrlst.stream().sorted().collect(Collectors.toList());
		System.out.println(ascending);
		ArrayList<String> descending = (ArrayList<String>) arrlst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descending);
	}

}
