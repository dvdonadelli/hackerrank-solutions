package br.com.hackerrank.solutions.diagonaldifference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    // TODO: Aprender e desenvolver testes unitários para testar as soluções com diversos cenários
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Stream.of("1,2,3,4".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("5,6,7,8".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("1,2,3,4".split(",")).map(Integer::parseInt).collect(Collectors.toList()));
        arr.add(Stream.of("5,6,7,8".split(",")).map(Integer::parseInt).collect(Collectors.toList()));

        System.out.println(Result.diagonalDifference(arr));
    }
}
