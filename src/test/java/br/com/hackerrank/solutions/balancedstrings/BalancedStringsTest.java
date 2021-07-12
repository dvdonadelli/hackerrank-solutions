package br.com.hackerrank.solutions.balancedstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedStringsTest {

    @Test
    void shouldReturnTrueTestCase1() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertTrue(balancedStrings.isBalanced("{}()[{}]"));
    }

    @Test
    void shouldReturnTrueTestCase2() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertTrue(balancedStrings.isBalanced("[({})]"));
    }

    @Test
    void shouldReturnTrueTestCase3() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertTrue(balancedStrings.isBalanced("({[]})"));
    }

    @Test
    void shouldReturnFalseTestCase1() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertFalse(balancedStrings.isBalanced("[({)}]"));
    }

    @Test
    void shouldReturnFalseTestCase2() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertFalse(balancedStrings.isBalanced("({[})"));
    }

    @Test
    void shouldReturnFalseTestCase3() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertFalse(balancedStrings.isBalanced("()}[]"));
    }

}