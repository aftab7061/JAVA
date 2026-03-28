package Challenge.Challenge31;

import java.util.Scanner;

public class OppositeHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number = ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {

            // space print ke liye
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            } 

            // star print ke liye
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
