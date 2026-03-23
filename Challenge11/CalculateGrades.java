package Challenge.Challenge11;

import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your percentage = ");
        float percentage=input.nextFloat();
        if (percentage>=90) {
            System.out.println("your grade is A ");
        } else if (percentage>=75) {
            System.out.println("your grade is B");
        } else if (percentage>=60) {
            System.out.println("your grade is C");
        }else if (percentage>=30) {
            System.out.println("your grade is E");
        }
        else{
            System.out.println("your are fail ");
        }
        input.close();
    }
}
