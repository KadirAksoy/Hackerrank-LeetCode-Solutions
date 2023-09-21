package ProblemSolving;

public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {
        int distanceA = Math.abs(x - z);
        int distanceB = Math.abs(y - z);

        if (distanceA < distanceB) {
            return "Cat A";
        } else if (distanceA > distanceB) {
            return "Cat B";
        } else {
            return "Mouse C";
        }


    }
}
