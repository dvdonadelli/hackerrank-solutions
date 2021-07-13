package br.com.hackerrank.solutions.warmup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {

    // The problem here is to find how many pairs of 'socks' with matching colors are there in an given array
    // of integers, representing the color of each sock.

    public static int pairOfSocks(List<Integer> arrayOfColors) {
        Set<Integer> setOfColors = new HashSet<>();
        int count = 0;
        for (int i : arrayOfColors) {
            if (setOfColors.contains(i)) {
                setOfColors.remove(i);
                count++;
            } else {
                setOfColors.add(i);
            }
        }
        return count;
    }

}
