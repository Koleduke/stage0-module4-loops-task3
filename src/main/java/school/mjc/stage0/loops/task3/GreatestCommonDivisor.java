package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        if (first!=0&&second!=0){
            int x = first, y = second, gcd = 1;
//running loop form 1 to the smallest of both numbers
            for(int i = 1; i <= x && i <= y; i++)
            {
//returns true if both conditions are satisfied
                if(x%i==0 && y%i==0)
//storing the variable i in the variable gcd
                    gcd = i;
            }
//prints the gcd
            //System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
            System.out.println(gcd);}
        else{ if(first>=second){System.out.println(first);}
            else{System.out.println(second);}
    }

    }
}
