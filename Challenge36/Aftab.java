package Challenge.Challenge36;

import java.util.Arrays;
import java.util.Scanner;

import Challenge.ArrayUtility;
// import Challenge.Challenge31.starPatterns;

public class Aftab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        // System.out.println("enter element you want to find = ");
        // int occNum = sc.nextInt();
        System.out.println("enter element you want to delete = ");
        int deleteNum = sc.nextInt();

        findOccurences(numArray, deleteNum);
        // System.out.println(occ);

        int[] newArray=deleteElement(numArray, deleteNum);

        // System.out.println(deleteElement(numArray, deleteNum, occNum));
        System.out.print(Arrays.toString(newArray));
        sc.close();
    }

    public static int findOccurences(int[] numArray, int occNum) {

        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == occNum) {
                count++;
            }
        }
        return count;
    }

    public static int[] deleteElement(int[] numArray, int deleteNum) {
        int NoOc = findOccurences(numArray, deleteNum);

        int newSize = numArray.length - NoOc;
        int[] newArray = new int[newSize];

        int j = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != deleteNum) {
                newArray[j++] = numArray[i];
            }
        }

        return newArray;
    }

}
