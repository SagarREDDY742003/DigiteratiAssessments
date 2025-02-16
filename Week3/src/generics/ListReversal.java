package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reverse a list

public class ListReversal {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(reverseList(list));

	}

	private static <T> List<T> reverseList(List<T> list) {
		List<T> reverseList = new ArrayList<>(list);
		Collections.reverse(reverseList);
		return reverseList;
	}

}
