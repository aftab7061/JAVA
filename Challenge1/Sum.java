package Challenge.Challenge1;

import java.util.Scanner;

public class Sum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Welcome to  java ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum of your number is = " + sum);

        int sub = firstNum - secondNum;
        System.out.println("sub of your number is = " + sub);

        int mul = firstNum * secondNum;
        System.out.println("mul of your number is = " + mul);

        int div = firstNum / secondNum;
        System.out.println("div of your number is = " + div);
        input.close();
    }
}
