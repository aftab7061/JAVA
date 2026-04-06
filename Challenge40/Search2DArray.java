package Challenge.Challenge40;

import java.util.Scanner;

import Challenge.ArrayUtility;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Search 2D Array");
        int[][] numArray = ArrayUtility.input2DArray();
        System.out.println("Now enter the number you wanr to search");
        int num = sc.nextInt();
        boolean isFound = search(numArray, num);
        if (isFound) {
            System.out.println("your number was found");
        } else {
            System.out.println("your number was not found");
        }
    }

    public static boolean search(int[][] numArray, int num) {

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                if (numArray[i][j] == num) {
                    return true;
                }
            }
        }

        return false;
    }
}
