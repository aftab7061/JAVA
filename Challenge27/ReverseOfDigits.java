package Challenge.Challenge27;

import java.util.Scanner;

public class ReverseOfDigits {

    // 765 = 567
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your number = ");
        int num = sc.nextInt();
        int reverse = reverseDigit(num);
        System.out.println("reverse of your number is = " + reverse);

        sc.close();
    }

    public static int reverseDigit(int number) {

        int newNum = 0;
        while (number > 0) {
            int digit = number % 10;
            newNum=newNum*10+digit;
            number=number/10;
        }

        return newNum;
    }
}
