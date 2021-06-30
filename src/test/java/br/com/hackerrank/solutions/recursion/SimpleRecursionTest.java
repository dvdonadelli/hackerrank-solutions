package br.com.hackerrank.solutions.recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Exponentiation;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Summation;
import static br.com.hackerrank.solutions.recursion.SimpleRecursion.Factorial;

class SimpleRecursionTest {

    @Test
    void summationOfFiveShouldReturnFifteen() {
        int ret = Summation(5);

        assertEquals(15, ret);
    }

    @Test
    void summationOfOneShouldReturnOne() {
        int ret = Summation(1);

        assertEquals(1, ret);
    }

    @Test
    void summationOfZeroShouldReturnZero() {
        int ret = Summation(0);

        assertEquals(0, ret);
    }

    @Test
    void factorialOfZeroShouldReturnOne() {
        int ret = Factorial(0);

        assertEquals(1, ret);
    }

    @Test
    void factorialOfFiveShouldReturn120() {
        int ret = Factorial(5);

        assertEquals(120, ret);
    }

    @Test
    void factorialOfOneShouldReturnOne() {
        int ret = Factorial(1);

        assertEquals(1, ret);
    }

    @Test
    void fiveExponentTwoShouldReturn25() {
        int ret = Exponentiation(5, 2);

        assertEquals(25, ret);
    }

    @Test
    void twentyFiveExponentFiveShouldReturn9765625() {
        int ret = Exponentiation(25, 5);

        assertEquals(9765625, ret);
    }

    @Test
    void fiveHundredExponentZeroShouldReturn1() {
        int ret = Exponentiation(500, 0);

        assertEquals(1, ret);
    }

    @Test
    void fiveHundredExponentOneShouldReturn500() {
        int ret = Exponentiation(500, 1);

        assertEquals(500, ret);
    }
}