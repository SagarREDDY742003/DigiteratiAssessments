package generics;

import java.util.ArrayList;
import java.util.List;

//Merge two lists by alternating elements

public class ListMerge {

	public static void main(String[] args) {
		List<String> lst1 = List.of("a","b","c");
		List<String> lst2 = List.of("1","2","3");
		System.out.println(merge(lst1,lst2));

	}

	private static <T> List<T> merge(List<T> lst1, List<T> lst2) {
		List<T> mergedList = new ArrayList<T>();
		for (int i = 0; i < Math.max(lst1.size(),lst2.size()); i++) {
			if(i<lst1.size())
				mergedList.add(lst1.get(i));
			if(i<lst2.size())
				mergedList.add(lst2.get(i));
			
		}
		return mergedList;
	}

}
