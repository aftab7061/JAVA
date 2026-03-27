package Challenge.Challenge26;

import java.util.Scanner;

public class IsPrimeSecMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yoyr number to checl prime = ");
        int num = sc.nextInt();
        isPrime(num);
        sc.close();
    }

    public static int isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("prime ");
        }else{
            System.out.println("not prime");
        }
        return 0;
    }
}
