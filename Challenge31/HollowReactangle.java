package Challenge.Challenge31;

import java.util.Scanner;

public class HollowReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rows and column = ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();

        // outer loop
        for (int i = 1; i <= row; i++) {

            // inner loop
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        
    }
}
