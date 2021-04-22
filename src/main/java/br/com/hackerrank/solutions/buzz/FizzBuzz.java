package br.com.hackerrank.solutions.buzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt())
            n = in.nextInt();
        else
            n = 15;

        Resultado.fizzBuzz(n);
    }
}
