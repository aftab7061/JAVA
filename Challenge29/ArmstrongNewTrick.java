package Challenge.Challenge29;

import java.util.Scanner;

public class ArmstrongNewTrick {
    public static void main(String[] args) {

        // 153 ---> (1*1*1  +  5*5*5  +  3*3*3)  = 153

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number = ");
        int num = sc.nextInt();
        int copyNum = num;
        int rem, arm = 0;
        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;
        }
        if (copyNum == arm) {
            System.out.println("your number is armstrong");
        } else {
            System.out.println("your number is not armstrong");
        }
        sc.close();
    }
}
