package br.com.hackerrank.solutions.binary;

import java.util.Scanner;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        // That is so convenient! lol
        String bin = Integer.toBinaryString(n);

        // In this solution I'm printing the corresponding binary number
        // And finding and printing the number of consecutive 1's in the number binary representation
        // Test comment
        System.out.println(bin);
        System.out.println(maxRepeat(bin));
    }

    public static int maxRepeat(String s) {
        int len = s.length(); // 4
        int count = 0;
        char c = s.charAt(0); // 1

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != '1') continue;
            int cur_count = 1;
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) != s.charAt(j)) break;

                cur_count++;
            }

            if (cur_count > count) count = cur_count;
        }

        return count;
    }

}
