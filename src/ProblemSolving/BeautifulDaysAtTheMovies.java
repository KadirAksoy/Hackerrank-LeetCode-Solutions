package ProblemSolving;

public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here

        int count = 0;

        for(int x = i; x <= j; x++){
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());

            if(Math.abs(x-xReverse) % k == 0){
                count++;
            }
        }
        return count;
    }
}
