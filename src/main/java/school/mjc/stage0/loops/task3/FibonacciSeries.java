package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        printFib(lastFibonacci);
    }

    static void printFib(int n) {
        // When the number of terms is less than 1
        if (n < 1) {
            System.out.println("Invalid number of terms");
        }
        // When the number of terms is 1
        else if (n == 1) {
            System.out.println(0);
        }
        // When the number of terms is 2
        else if (n == 2) {
            System.out.println("0\n1");
        }
        // Number of terms greater than 2
        else {
            System.out.print("0\n1\n");
            fib(n, 1, 0);
        }
    }
    static void fib(int n, int prev1, int prev2) {
        if (n < 3) {
            return;
        }
        int fn = prev1 + prev2;
        prev2 = prev1;
        prev1 = fn;
        System.out.println(fn);
        fib(n - 1, prev1, prev2);
    }
}