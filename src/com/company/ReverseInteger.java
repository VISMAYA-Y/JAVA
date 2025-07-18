package com.company;
class Solution {
    public int reverse(int x) {
        return reverseHelper(x, 0);
    }

    public int reverseHelper(int x, int rev) {
        // Base case
        if (x == 0) return rev;

        // Overflow check
        if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) return 0;

        int rem = x % 10;         // Get last digit
        x = x / 10;               // Remove last digit
        rev = rev * 10 + rem;     // Shift rev and add digit

        return reverseHelper(x, rev);
    }
}

public class ReverseInteger {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // User input
        System.out.print("Enter an integer to reverse: ");
        int x = sc.nextInt();

        // Call solution
        Solution sol = new Solution();
        int result = sol.reverse(x);

        // Output
        System.out.println("Reversed integer: " + result);
    }
}