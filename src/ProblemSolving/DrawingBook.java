package ProblemSolving;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

    }
}
