package br.com.hackerrank.solutions.triplets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] result = new int[2];
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                result[0] = a.get(i) > b.get(i) ? result[0] + 1 : result[0];
                result[1] = a.get(i) < b.get(i) ? result[1] + 1 : result[1];
            }
        }

        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }
}
