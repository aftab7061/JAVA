package Challenge.Challenge31;

import java.util.Scanner;

public class Reactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your number = ");
        int num=sc.nextInt();
        sc.close();

        for(int i=1; i<=num; i++){
            for(int j=1;j<=num;j++){
                System.out.print(" *");
            }
           System.out.println();
        }
    }

}
