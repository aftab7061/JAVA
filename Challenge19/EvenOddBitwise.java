package Challenge.Challenge19;

import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        System.out.println("find Even and odd using bitwise operatior ");
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your number = ");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println("your number is odd");
        } else {
            System.out.println("your number is even");
        }
        sc.close();
    }
}
