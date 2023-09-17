package ProblemSolving;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int price = 0;
        int sum = 0;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                sum = keyboards[i] + drives[j];
                if(price <= sum && sum <= b){
                    price = sum;
                }
            }
        }
        if(price == 0){ return -1;}
        return price;

    }
}
