package Challenge.Challenge6;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        System.out.println("convert fahrenheit to celcius ");
        // cel=(fah-32)*5/9
        Scanner input =new Scanner(System.in);
        System.out.print("Enter temprature in F = ");
        float fahrenheit=input.nextInt();
        float cel=(fahrenheit-32)*5/9;
        System.out.println("temprature in cel = "+cel);
        input.close();
    }
}
