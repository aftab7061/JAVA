package Challenge.Challenge21;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number = ");
        int number = sc.nextInt();
        int sum = sum(number);
        System.out.println("odd sum " + number + " is " + sum);
        sc.close();
    }

    public static int sum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }

}
