package premitiveAndReferenceVariable;

public class Demo {
    public static void modifyPrimitive(int num) {
        num = 100; // Modifying the primitive variable
    }

    public static void modifyReference(int[] arr) {
        arr[0] = 100; // Modifying the first element of the array
    }

    public static void main(String[] args) {
        int primitive = 10;
        int[] reference = {1, 2, 3};

        // Print original values
        System.out.println("Original primitive value: " + primitive);
        System.out.println("Original array: " + java.util.Arrays.toString(reference));

        // Modify primitive and reference variables
        modifyPrimitive(primitive);
        modifyReference(reference);

        // Print modified values
        System.out.println("Modified primitive value: " + primitive);
        System.out.println("Modified array: " + java.util.Arrays.toString(reference));
    }
}

