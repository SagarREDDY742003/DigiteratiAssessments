package task1;

import java.util.Arrays;
/*
Task 3 : Demonstrate with an example with the difference between equals() vs deepEquals() method? 
*/
public class Task3 {
    public static void main(String[] args) {
        // Creating two 1D arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // equals() method comparison
        boolean equalsResult = Arrays.equals(array1, array2);
        System.out.println("Using equals() on 1D arrays: " + equalsResult);

        // deepEquals() method comparison
        boolean deepEqualsResult = Arrays.deepEquals(new int[][]{array1}, new int[][]{array2});
        System.out.println("Using deepEquals() on 1D arrays: " + deepEqualsResult);

        // Creating two 2D arrays
        int[][] array3 = {{1, 2}, {3, 4}};
        int[][] array4 = {{1, 2}, {3, 4}};

        // equals() method comparison on 2D arrays
        equalsResult = Arrays.equals(array3, array4);
        System.out.println("Using equals() on 2D arrays: " + equalsResult);

        // deepEquals() method comparison on 2D arrays
        deepEqualsResult = Arrays.deepEquals(array3, array4);
        System.out.println("Using deepEquals() on 2D arrays: " + deepEqualsResult);

    }
}

