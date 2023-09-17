package ProblemSolving;

import java.util.*;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highScore = 0;
        int lowScore = 0;

        int firstHighScore = scores.get(0);
        int firstLowScore = scores.get(0);

        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) > firstHighScore){
                highScore++;
                firstHighScore = scores.get(i);
            }else if(scores.get(i) < firstLowScore){
                lowScore++;
                firstLowScore = scores.get(i);
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(highScore);
        list.add(lowScore);
        return list;

    }
}
