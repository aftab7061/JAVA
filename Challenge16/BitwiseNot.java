package Challenge.Challenge16;

import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        System.out.println("showing bitwise NOT operator");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number = ");
        int firstNum = sc.nextInt();

        int result = ~firstNum;
        System.out.println("Result = " + result);
        sc.close();
    }
}
