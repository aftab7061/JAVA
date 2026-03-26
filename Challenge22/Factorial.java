package Challenge.Challenge22;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number = ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is = " + fact);
        sc.close();
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact = fact * i;
            i++;
        }

        return fact;
    }
}
