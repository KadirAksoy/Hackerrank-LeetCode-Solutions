package ProblemSolving;

import java.util.*;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for(Integer num : ar){
            if(hashMap.containsKey(num)){
                int i = hashMap.get(num);
                hashMap.put(num, i + 1);
            }else{
                hashMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            count += entry.getValue() / 2;


        }

        return count;

    }
}
