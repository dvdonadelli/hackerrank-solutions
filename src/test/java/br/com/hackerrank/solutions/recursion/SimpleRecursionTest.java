package br.com.hackerrank.solutions.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Exponentiation;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Summation;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Factorial;

class SimpleRecursionTest {

    @Test
    void summationOfFiveShouldReturnFifteen() {
        int res = Summation(5);

        Assertions.assertEquals(15, res);
    }

    @Test
    void factorial() {
    }

    @Test
    void exponentiation() {
    }
}