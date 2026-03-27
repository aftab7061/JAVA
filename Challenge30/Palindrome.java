package Challenge.Challenge30;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // 121 is palindrome number , reverse karne par 121ki aayega

        Scanner sc = new Scanner(System.in);
        System.out.print(" enter your number = ");
        int num = sc.nextInt();

        palidrome(num);
        sc.close();
    }

    public static int palidrome(int num) {
        int copyNum = num;
        int p = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            p = p * 10 + rem;
            num = num / 10;
        }
        if (copyNum == p) {
            System.out.println("palidrome number ");
        } else {
            System.out.println("not palindrome number");
        }
        return 0;
    }

}
