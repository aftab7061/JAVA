package Challenge.Challenge35;

import Challenge.ArrayUtility;

public class soertedArray {public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        boolean incresing = isIncresing(numArray);
        boolean decresing = isDecresing(numArray);
        if (incresing||decresing) {
            System.out.println("this given array is sorted");
        }
        else{
            System.out.println("this given array is not sorted ");
        }

    }

    public static boolean isIncresing(int[] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] < numArray[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecresing(int[] numArray) {
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > numArray[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
