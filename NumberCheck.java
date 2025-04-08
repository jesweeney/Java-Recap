/*
@author Jessica Sweeney
Implements IsOdd and test it in main.
Implements IsPrime.
 */

public class NumberCheck {
    public static void main(String[] args) {
        int number = 65; // Example number to test.

        // Test isOdd
        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }

        // Test isPrime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is odd
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, it's prime
    }
}

