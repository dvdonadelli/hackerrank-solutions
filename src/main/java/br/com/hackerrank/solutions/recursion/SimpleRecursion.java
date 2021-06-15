package br.com.hackerrank.solutions.recursion;

import java.util.Scanner;

public class SimpleRecursion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hey, this is a class to test my simple recursion methods");
        System.out.println("Let's see");
        System.out.println();
        System.out.println("Please enter a value and I'll tell you the Summation, Factorial of this value:");
        int n = s.nextInt();

        System.out.println("The summation of " + n + " is: " + Summation(n) + " and the Factorial is: " + Factorial(n));
    }

    public static int Summation(int n) {
        // This is de BASE CASE: We're at the end of the recursion. The last number to sum is 0
        if (n <= 0) return 0;

        // This is the RECURSION CASE: Do it again
        return n + Summation(n - 1);
    }

    public static int Factorial(int n) {
        // The BASE CASE of Factorial: The last number to multiply is 1
        if (n <= 0) return 1;

        // The RECURSION CASE: Do it again
        return n * Factorial(n - 1);
    }

    public static int Exponentiation(int n, int p) {
        // The BASE CASE of Exponentiation: The last number to multiply is the n itself
        if (p <= 1) return n;

        // The RECURSION CASE: Do it again
        return n * Exponentiation(n, p - 1);
    }
}
