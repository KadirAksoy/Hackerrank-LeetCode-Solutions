package ProblemSolving;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int r = m % n;
        if ((r + s - 1) % n == 0) {
            return n;
        } else {
            return ((r + s - 1) % n);
        }

    }
}
