package Challenge.Challenge9;

import java.util.Scanner;

public class LargestOfThreeNum {
    public static void main(String[] args) {
        System.out.println("find largest of three number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number = ");
        int firstNum = input.nextInt();

        System.out.print("Enter Your Second Number = ");
        int secondNum = input.nextInt();

        System.out.print("Enter Your Third Number = ");
        int thirdNum = input.nextInt();
        
        if (firstNum>secondNum && firstNum>thirdNum) {
            System.out.println("your number " + firstNum +" is largest of three numbers");
        }else if (secondNum>firstNum && secondNum>thirdNum) {
            System.out.println("your number " + secondNum +" is largest of three numbers");
        }else{
            System.out.println("your number " + thirdNum +" 1is largest of three numbers");
        }
        input.close();
    }
}
