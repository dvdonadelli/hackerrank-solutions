package br.com.hackerrank.solutions.warmup;

public class CountingValleys {

    public static int countingValleys(int n, String path) {
        int altitude = 0, valleys = 0;
        for (int i = 0; i < n; i++){
            char step = path.charAt(i);
            if (step == 'U'){
                altitude++;
                if (altitude == 0)
                    valleys++;

            } else
                altitude--;
        }
        return valleys;
    }

}
