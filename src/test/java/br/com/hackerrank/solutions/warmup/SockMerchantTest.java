package br.com.hackerrank.solutions.warmup;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SockMerchantTest {

    @Test
    void pairOfSocksShouldReturnThree() {
        int n = SockMerchant.pairOfSocks(List.of(10, 20, 20, 10, 10, 30, 50, 10, 20));

        assertEquals(3, n);
    }
}