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

    // Function to print the Principal Diagonal
    static void printPrincipalDiagonal(List<List<Integer>> arr, int n) {
        System.out.print("Principal Diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(arr.get(i).get(j) + ", ");
                }
            }
        }
        System.out.println("");
    }

    // Function to print the Secondary Diagonal
    static void printSecondaryDiagonal(List<List<Integer>> arr, int n) {
        System.out.print("Secondary Diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for secondary diagonal
                if ((i + j) == (n - 1)) {
                    System.out.print(arr.get(i).get(j) + ", ");
                }
            }
        }
        System.out.println("");
    }

}
