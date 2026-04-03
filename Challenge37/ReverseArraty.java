package Challenge.Challenge37;

// import java.lang.reflect.Array;
// import java.util.Arrays;

import Challenge.ArrayUtility;

public class ReverseArraty {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();

        reverse(array);

        System.out.println("Here is reverse array");
        ArrayUtility.display(array);
        // System.out.println(array.toString(r));
        // System.out.println("Original Array: " + Arrays.toString(array));
        // System.out.println("Reversed Array: " + r);
    }

    public static void reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;

        }

    }
}
