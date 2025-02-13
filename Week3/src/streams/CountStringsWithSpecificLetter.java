package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class CountStringsWithSpecificLetter {

	public static void main(String[] args) {
		ArrayList<String> arrlst = new ArrayList<>(Arrays.asList("sagar","reddy","dinesh","sai hari","sagar"));
		System.out.println(arrlst);
		char ch = 's';
		long count = arrlst.stream().filter(s->(s.charAt(0)==ch)).count();
		System.out.println("Number of strings with starting character '"+ch+"' are: "+count);

	}

}
