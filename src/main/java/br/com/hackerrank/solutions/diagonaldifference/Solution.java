package br.com.hackerrank.solutions.diagonaldifference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static void main(String[] args) {
        int n = 4;
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Stream.of("1,2,3,4".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("5,6,7,8".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("1,2,3,4".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("5,6,7,8".split(",")).map(Integer::parseInt).collect(Collectors.toList()));

        arr.forEach(System.out::println);

        Result.printPrincipalDiagonal(arr, arr.size());
        Result.printSecondaryDiagonal(arr, arr.size());

    }
}
