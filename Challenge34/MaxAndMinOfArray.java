package Challenge.Challenge34;

import Challenge.ArrayUtility;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();

        int min = min(numArray);
        int max = max(numArray);
        System.out.println("min element of the array = "+min);
        System.out.println("max element of the array = "+max);
    }

    public static int min(int[] numArray) {

        int min = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
        }
        return min;
    }

    public static int max(int[] numArray) {

        int max = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (max < numArray[i]) {
                max = numArray[i];
            }
        }
        return max;
    }
}
