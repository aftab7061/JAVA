package Challenge;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements size = ");
        int size = sc.nextInt();
        int[] nums = new int[size];

        // int i = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("please enter element no " + (i + 1) + " :");
            nums[i] = sc.nextInt();
        }
        return nums;

    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows  = ");
        int row = sc.nextInt();
        System.out.print("enter columns = ");
        int col = sc.nextInt();
        int[][] nums = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print("please enter element row :" + (i + 1) + " , column: " + (j + 1) + " :");
                nums[i][j] = sc.nextInt();
            }

        }
        return nums;

    }

    public static void display(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println();
    }
}
