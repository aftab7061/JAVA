package Challenge.Challenge14;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        System.out.println("showing bitwise OR operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNum = sc.nextInt();
        System.out.print("enter second number = ");
        int secondNum = sc.nextInt();

        int result = firstNum | secondNum;
        System.out.println("Result = " + result);
        sc.close();
    }
}
