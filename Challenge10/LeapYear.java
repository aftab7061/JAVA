package Challenge.Challenge10;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("check year is leap year ya not");
        // leap year condition ,year is divisible by 4 but not 100 and
        // also divisible by 400
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Any Year = ");
        int year = input.nextInt();
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("your year is a leap year");
        } 

        // else if (year % 100 == 0) {
        //     System.out.println("your year is not a leap year");
        
        // } else if (year % 4 == 0) {
        //     System.out.println("your year is a leap year");
        // }
        
        
        else {
            System.out.println("your year is not a leap year");
        }
        input.close();
    }
}
