package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {


        List<Integer> res = new ArrayList<>();
        int len = a.size();
        int pos = k % len;
        for(int i : queries) {
            res.add(a.get(i - pos >= 0 ? i - pos : (len + i) - pos));
        }

        return res;
        // Write your code here

    }
}
