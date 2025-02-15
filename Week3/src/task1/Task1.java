package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
/*Task 1 : Write a Java program to copy the alternative elements in the array.*/
public class Task1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrlst = new ArrayList<Integer>();
		arrlst.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		ArrayList<Integer> altList = (ArrayList<Integer>) arrlst.stream().filter(s->arrlst.indexOf(s)%2==0).collect(Collectors.toList());
		System.out.println(altList);
	}

}
