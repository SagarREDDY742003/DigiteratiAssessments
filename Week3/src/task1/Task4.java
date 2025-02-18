package task1;
import java.util.Arrays;

/*
Task 4 : Use ArrayCopyRange() function to demonstrate and example such that you copy the range of values in an 
array. 
*/

public class Task4 {
	public static void main(String[] args) {
		int[] arrlst = {1,2,3,4,5,6,7,8};
		int[] copy = Arrays.copyOfRange(arrlst, 0, 4);
		for(int i : copy) {	
			System.out.println(i);
		}
	}
}
