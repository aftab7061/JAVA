package Challenge.Challenge3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // area of traingle= 1/2*b*h
        System.out.println("Find Area of triangle");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter breadth = ");
        int breadth = input.nextInt();
        System.out.print("Enter height = ");
        int height = input.nextInt();
        float area = (breadth * height)/2;
        System.out.println("area of triangle = " + area);
        input.close();
    }
}
