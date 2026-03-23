package Challenge.Challenge12;

import java.util.Scanner;

public class CategorizeAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        if (age <= 13) {
            System.out.println("child");
        } else if (age <= 20) {
            System.out.println("teen");
        } else if (age <= 60) {
            System.out.println("adult");
        } else {
            System.out.println("senior");
        }
        sc.close();
    }
}
