package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        String str = "";
        int res = 0;
        for (int i = 0; i<lengthOfLastNumber;i++){

            str+="9";
            res+=Integer.valueOf(str);

        }
        System.out.println(res);
    }
}
