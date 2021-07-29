package br.com.hackerrank.solutions.warmup;

public class CountingValleys {

    // Parameters
    // n = The amount of steps the Hiker made
    // path = All the path {U for Up, D for Down}
    // Expected output
    // A number representing the number of valley's he's been through
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
