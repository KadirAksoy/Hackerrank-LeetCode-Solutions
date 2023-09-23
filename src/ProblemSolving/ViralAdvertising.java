package ProblemSolving;

public class ViralAdvertising {

    public static int viralAdvertising(int n) {
        // Write your code here
        int sum = 0;
        int p = 5;
        for(int i = 0; i < n;i++){
            p = (int) Math.floor(p / 2);
            sum += p;
            p = p * 3;
        }

        return sum;

    }
}
