package ProblemSolving;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int applesCount = 0;
        int orangesCount = 0;

        for (int i = 0; i < apples.size(); i++) {
            int appleDistance = a + apples.get(i);
            if (appleDistance >= s && appleDistance <= t) {
                applesCount++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            int orangeDistance = b + oranges.get(i);
            if (orangeDistance >= s && orangeDistance <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
