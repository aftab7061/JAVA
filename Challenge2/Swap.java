package Challenge.Challenge2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("swapping of two numbers ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNumber = input.nextInt();
        System.out.print("enter second number = ");
        int secondNumber = input.nextInt();
        int swap;

        swap = firstNumber;
        firstNumber = secondNumber;
        secondNumber = swap;
        
        System.out.println("after swapping first number = " + firstNumber);
        System.out.println("after swapping second number = " + secondNumber);

        input.close();
    }
}
