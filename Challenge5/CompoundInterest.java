package Challenge.Challenge5;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("find compound interest");
        // p(1+r/100)
        Scanner input = new Scanner(System.in);
        System.out.println("Enetr principle time and rate");
        int p = input.nextInt();
        int t = input.nextInt();
        float r = input.nextInt();

        double compoundInterest=p* Math.pow((1+r/100), t);
        System.out.println("Compound Interest = "+compoundInterest);
        input.close();
    }
}
