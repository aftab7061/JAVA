package Challenge.Challenge4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest");
        // (p*t*r)/100 formula
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr principle time and rate");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();
        float simpleInterest = (p * t * r)/100;
        System.out.println("Simple Interest = "+simpleInterest);
        input.close();
    }
}
