package Challenge.Challenge41;

import Challenge.ArrayUtility;

public class SumOf2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("sum of 2D array " + sum);
        System.out.println("average of 2D array " + average);
    }

    public static long sum(int[][] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                sum = sum + numArray[i][j];

            }
        }
        return sum;
    }

    public static double average(int[][] numArray) {
        long sum = sum(numArray);
        int row = numArray.length;
        int col = numArray[0].length;
        
        double size=row*col;
        return sum/size;
    }
}
