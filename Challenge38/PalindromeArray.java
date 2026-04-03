package Challenge.Challenge38;

import Challenge.ArrayUtility;

public class PalindromeArray {
    public static void main(String[] args) {

        int[] numArray = ArrayUtility.inputArray();
        boolean isPal = isPalindrome(numArray);
        if (isPal) {
            System.out.println("your array is palindrome ");
        } else {
            System.out.println("your array is not palindrome ");
        }

    }

    public static boolean isPalindrome(int[] numArray) {

        for (int i = 0; i < numArray.length / 2; i++) {
            if (numArray[i] != numArray[numArray.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
