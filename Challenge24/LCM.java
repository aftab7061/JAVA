package Challenge.Challenge24;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Enter first Number = ");
        int first = sc.nextInt();

        System.out.print("Enter second Number = ");
        int second = sc.nextInt();

        int lcm = lcm(first, second);
        System.out.println("lcm of two numbers = " + lcm);

        sc.close();
    }

    public static int lcm(int first, int second) {
        // int i = 1;
        // while (i <= second) {
        // int factor = first * i;
        // if (factor % second == 0) {
        // return factor;
        // }
        // i++;
        // }

        for (int i = 1; i <= second; i++) {

            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
        }
        return 0;
    }

}
