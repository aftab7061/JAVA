package Challenge.Challenge20;

import java.util.Scanner;

public class TableOfNum {
    public static void main(String[] args) {
        System.out.println("multiplication of two numbers\n");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter number = ");
        int number = sc.nextInt();
        table(number);
    }

    public static void table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }

}
