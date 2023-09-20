package ProblemSolving;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleyCounter = 0, altitude = 0;

        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCounter++;
                }

            } else {

                altitude--;
            }
        }
        return valleyCounter;

    }
}
