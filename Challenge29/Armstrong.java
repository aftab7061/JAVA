package Challenge.Challenge29;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome to armstrong number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number = ");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("your number is armstrong");
        } else {
            System.out.println("your number is not armstrong");
        }

        sc.close();

    }

    public static boolean isArmstrong(int num) {

        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber=finalNumber+pow(lastDigit,noOfDigits);
        }

        return finalNumber==numCopy;
    }

    public static int noOfDigits(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }

    public static int pow(int num1, int num2) {

        int result = 1;
        int i = 0;
        while (i < num2) {
            result = result * num1;
            i++;
        }
        return result;
    }
}
