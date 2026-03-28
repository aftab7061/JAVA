package Challenge.Challenge32;

import Challenge.ArrayUtility;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(" welcome to array sum and average ");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int average = average(numArray);
        System.out.println("sum of the array is = " + (sum));
        System.out.println("average of the array is = " + (average));

    }

    public static long sum(int[] numArray) {

        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        return sum;
    }

    public static int average(int[] numArray) {
        long sum = sum(numArray);

        return (int) (sum / numArray.length);
    }
}
