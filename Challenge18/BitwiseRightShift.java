package Challenge.Challenge18;

import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        System.out.println("showing bitwise Right shift operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNum = sc.nextInt();

        int result = firstNum>>1;
        System.out.println("Result = " + result);
        sc.close();
    }
}
