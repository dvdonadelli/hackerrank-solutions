package br.com.hackerrank.solutions.buzz;

public class Resultado {
    public static void fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (!(i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println(i);
            } else {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }
                }
            }

        }
    }
}
