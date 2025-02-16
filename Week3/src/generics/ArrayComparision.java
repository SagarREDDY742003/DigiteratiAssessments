package generics;

//Check if two arrays have the same elements in the same order

public class ArrayComparision {

	public static void main(String[] args) {
		Integer[] array1 = {1,2,3};
		Integer[] array2 = {1,2,3};
		String[] array3 = {"1","2","3"};
		System.out.println(arraysCheck(array1,array2));
		System.out.println(arraysCheck(array1,array3));
	}

	private static <T> boolean arraysCheck(T[] array1, T[] array2) {
		if(array1.length != array2.length)
			return false;
		for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
		
	}

}
