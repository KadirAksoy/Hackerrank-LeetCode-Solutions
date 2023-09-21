package ProblemSolving;

import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int max = height.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        return Math.max(max - k, 0);

    }
}
