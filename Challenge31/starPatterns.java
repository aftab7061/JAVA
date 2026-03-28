package Challenge.Challenge31;

import java.util.Scanner;

public class starPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your rows = ");
        int rows = sc.nextInt();
        star(rows);
        sc.close();
    }

    public static void star(int row) {
    //   int i=0;
    //    while (i<row) {
    //     System.out.print("*");

    //     int j=0;
    //     while (j<i) {
    //         System.out.print(" *");
    //         j++;
    //     }
    //     System.out.println();
    //     i++;
    //    }

    for(int i=0; i<=row;i++){
        System.out.print("*");
        for(int j=1; j<=i;j++){
         System.out.print(" *");
        }
        System.out.println();
    }

    }
}
