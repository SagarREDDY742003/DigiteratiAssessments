package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConversion {

	public static void main(String[] args) {
		ArrayList<String> arrlst = new ArrayList<>(Arrays.asList("Sagar","Reddy","Dinesh","Sai Hari"));
		ArrayList<String> upperCase = (ArrayList<String>) arrlst.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		ArrayList<String> lowerCase = (ArrayList<String>) arrlst.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		System.out.println(lowerCase);

	}

}
