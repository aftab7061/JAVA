package Challenge.Challenge36;

import java.util.Arrays;
import java.util.Scanner;

import Challenge.ArrayUtility;
import Challenge.Challenge33.NumberOfOccurence;

public class DeletedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("enetr element you want to delete = ");
        int num = sc.nextInt();

        int[] newArray = deleteArray(numArray, num);

        // System.out.println(newArray); //print somthing like this [I@5e91993f

        System.out.println(Arrays.toString(newArray));
        sc.close();

    }

    public static int[] deleteArray(int[] numArray, int num) {
        int occ = NumberOfOccurence.NumberOfOccurenceArray(numArray, num);

        int newSize = numArray.length - occ;
        int[] newArray = new int[newSize];

        int j = 0;
        for (int i = 0; i < numArray.length; i++) {

            if (numArray[i] != num) {
                newArray[j++] = numArray[i];
            }
        }

        return newArray;
    }
}
