package Challenge.Challenge42;

// import java.lang.reflect.Array;
import java.util.Arrays;

import Challenge.ArrayUtility;

public class SumOfDigonal2DArray {
    public static void main(String[] args) {
        System.out.println(" Welcome to  Sum of Digonal Element ");
        int[][] numArray = ArrayUtility.input2DArray();

        System.out.println(Arrays.deepToString(numArray));

        long sum = digonalsum(numArray);
        System.out.println("sum of digonal =" + sum);
    }

    public static long digonalsum(int[][] numArray) {

        long left = leftdigonalsum(numArray);
        long right = rightdigonalsum(numArray);
        long sum = left + right;
        if (numArray.length % 2 != 0) {
            int ind = numArray.length / 2;
            sum = sum - numArray[ind][ind];
        }

        return sum;
    }

    public static long leftdigonalsum(int[][] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i][i];
        }
        return sum;
    }

    public static long rightdigonalsum(int[][] numArray) {
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            int col = numArray.length - 1 - i;
            sum = sum + numArray[i][col];
        }
        return sum;
    }
}
