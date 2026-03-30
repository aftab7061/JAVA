package Challenge.Challenge33;

import java.util.Scanner;

import Challenge.ArrayUtility;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print(" which number you want to find = ");
        int num = sc.nextInt();

        int count = NumberOfOccurenceArray(numArray, num);
        System.out.println(" your number is find " + count + " times");
        sc.close();
        // if (NumberOfOccurence(numArray, num)) {
        // System.out.println("your number is found in this array ");
        // } else {
        // System.out.println("your number is not found in this array ");
        // }

    }

    public static int NumberOfOccurenceArray(int[] numArray, int num) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == num) {
                count++;
            }

        }

        return count;
    }
}
