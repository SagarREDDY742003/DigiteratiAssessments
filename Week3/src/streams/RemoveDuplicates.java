package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> arrlst = new ArrayList<>(Arrays.asList("Sagar","Reddy","Dinesh","Sai Hari","Sagar"));
		System.out.println(arrlst);
		ArrayList<String> arrlstWithoutDuplicates = (ArrayList<String>) arrlst.stream().distinct().collect(Collectors.toList());
		System.out.println(arrlstWithoutDuplicates);

	}

}
