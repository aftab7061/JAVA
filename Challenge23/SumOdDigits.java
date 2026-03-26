package Challenge.Challenge23;

import java.util.Scanner;

public class SumOdDigits {
    public static void main(String[] args) {
        System.out.println("Number of digits\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number = ");
        int num = sc.nextInt();
        int sum = sumDigit(num);
        System.out.println("sum of digits is = " + sum);
        sc.close();

    }

    public static int sumDigit(int num) {
        int sum = 0;
        while (num > 0) {
          sum=sum+(num%10);
          num=num/10;
        }
        return sum;
    }
}
