package Challenge.Challenge7;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println("find  if a number is positive negative and zero");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter any number = ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("your number is positive");
        } else if (number == 0) {
            System.out.println("your number is zero");
        } else {
            System.out.println("your number is negative");
        }
        input.close();
    }
}
