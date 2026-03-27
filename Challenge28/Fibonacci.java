package Challenge.Challenge28;

import java.util.Scanner;

public class Fibonacci {

    //  0 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {
        System.out.println("Welcome tp fibonacci series");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        printFibonacci(num);
        sc.close();
    }

    public static void printFibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0 ");

        if (num == 0)
            return;
        System.out.print("1 ");

        int first = 0, second = 1;

        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
