package school.mjc.stage0.loops.task2;

import java.lang.reflect.Array;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        int[]  prime ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        while (i<=printToInclusive&&printToInclusive!=0&&i<prime.length){

            System.out.println(prime[i++]);}

                    }
}
