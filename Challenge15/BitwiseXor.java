package Challenge.Challenge15;

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        System.out.println("showing bitwise XOR operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNum = sc.nextInt();
        System.out.print("enter second number = ");
        int secondNum = sc.nextInt();

        int result = firstNum ^ secondNum;
        System.out.println("Result = " + result);
        sc.close();
    }
}
