package Challenge.Challenge17;

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        System.out.println("showing bitwise Left shift operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNum = sc.nextInt();

        int result = firstNum<<1;
        System.out.println("Result = " + result);
        sc.close();
    }
}
