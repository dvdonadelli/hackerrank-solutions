package br.com.hackerrank.solutions.warmup;

import org.junit.jupiter.api.Test;
import br.com.hackerrank.solutions.warmup.CountingValleys;

import static br.com.hackerrank.solutions.warmup.CountingValleys.countingValleys;
import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void countingValleysShouldReturnOne() {
        assertEquals(1, countingValleys(8, "UDDDUDUU"));
    }

    @Test
    void countingValleysShouldReturnTwo() {
        assertEquals(2, countingValleys(12, "DDUUDDUDUUUD"));
    }
}