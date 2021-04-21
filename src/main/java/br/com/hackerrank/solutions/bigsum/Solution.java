package br.com.hackerrank.solutions.bigsum;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Solution {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        // Recebe o tamanho do array
        System.out.println("Digite o tamanho do Array:");
        int arCount = s.nextInt();
        long[] ar = new long[arCount];

        // Recebe os items do array numa outra linha separados por um espaço
        System.out.println("Agora digite os items do Array separados por um espaço:");
        String[] arItems = s.next().split(",");
        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);
        System.out.println("O resultado da soma é: " + result);
    }

    private static long aVeryBigSum(long[] ar) {
        return LongStream.of(ar).sum();
    }
}
