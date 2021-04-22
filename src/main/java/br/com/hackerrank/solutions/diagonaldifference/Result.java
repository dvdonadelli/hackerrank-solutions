package br.com.hackerrank.solutions.diagonaldifference;

import java.util.List;

class Result {

    static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j)
                    firstDiagonalSum += arr.get(i).get(j);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if ((i + j) == (arr.size() - 1)) {
                    secondDiagonalSum += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(firstDiagonalSum - secondDiagonalSum);
    }

}
