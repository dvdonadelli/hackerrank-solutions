package br.com.hackerrank.solutions.balancedstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedStringsTest {

    @Test
    void isBalanced() {
        BalancedStrings balancedStrings = new BalancedStrings();

        assertTrue(balancedStrings.isBalanced("{}()[{}]"));
    }
}