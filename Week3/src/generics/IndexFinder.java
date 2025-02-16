package generics;

import java.util.List;

//Find the index of the first occurrence of the target element in a list

public class IndexFinder {

	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry");
        System.out.println(findIndex(list, "banana"));
	}

	private static <T> int findIndex(List<T> list, T string) {
		for(T str:list) {
			if(str == string)
				return list.indexOf(string);
		}
		return 0;
	}

}
