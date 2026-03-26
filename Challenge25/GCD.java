package Challenge.Challenge25;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Enter first Number = ");
        int first = sc.nextInt();

        System.out.print("Enter second Number = ");
        int second = sc.nextInt();

        int gcd = gcd(first, second);
        System.out.println("gcd of two numbers = " + gcd);

        sc.close();
    }

    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }

    }
}
