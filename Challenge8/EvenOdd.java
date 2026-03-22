package Challenge.Challenge8;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("find if a number is even and odd");
        Scanner input = new Scanner(System.in);
        System.out.print("please any number = ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("your number is even");
        } else {
            System.out.println("your number is odd");
        }
        input.close();
    }
}
