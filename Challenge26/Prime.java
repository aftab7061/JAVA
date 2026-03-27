package Challenge.Challenge26;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcomr to prime number checker");
        System.out.print("Enter your number = ");
        int num = sc.nextInt();
        boolean isPrime=isPrime(num);
        if (isPrime) {
            System.out.println("your number is prime");
        }
        else{
            System.out.println("your number is not prime");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
