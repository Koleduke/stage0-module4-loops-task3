package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int counter = firstBoarder-1;
        if (firstBoarder==secondBoarder*(-1)){ System.out.println(0);}
        else{
        if (firstBoarder==secondBoarder){ System.out.println(firstBoarder);}
        else{
        for (int iterator = firstBoarder; iterator <= secondBoarder; iterator++) {
            counter+=iterator;

        }
        System.out.println(counter);
    }}}
}
