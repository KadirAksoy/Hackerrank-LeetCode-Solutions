package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for(Integer x : p){
            res.add(x);
        }
        for(Integer i : p) {
            res.set((p.get((p.get(i-1) - 1))-1), i) ;
        }
        return res;


    }
}
