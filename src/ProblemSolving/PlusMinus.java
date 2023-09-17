package ProblemSolving;

import java.util.*;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zerosCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            } else {
                zerosCount++;
            }
        }

        int total = arr.size();
        int positive = (int) ((positiveCount / total) * 1000000);
        int negative = (int) ((negativeCount / total) * 1000000);
        int zeros = (int) ((zerosCount / total) * 1000000);

        System.out.println((double) positive / 1000000);
        System.out.println((double) negative / 1000000);
        System.out.println((double) zeros / 1000000);
    }
}
