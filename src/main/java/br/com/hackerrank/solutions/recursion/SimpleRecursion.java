package br.com.hackerrank.solutions.recursion;

import java.util.Scanner;

public class SimpleRecursion {

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
