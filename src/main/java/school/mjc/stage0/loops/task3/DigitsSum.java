package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = String.valueOf(Math.abs(t));
        int res = 0;
        for (int i = 0; i<str.length();i++){

            res +=Character.getNumericValue(str.charAt(i));

        }
        System.out.println(res);
    }
}
