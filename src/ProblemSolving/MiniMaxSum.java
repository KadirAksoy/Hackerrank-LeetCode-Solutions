package ProblemSolving;

import java.util.List;

public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {
        long sum = arr.get(0);
        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
            sum += value;
        }

        System.out.println(" " + (sum - max) + " " + (sum - min));
    }







}
