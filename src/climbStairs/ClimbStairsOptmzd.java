package climbStairs;

import java.math.BigInteger;

public class ClimbStairsOptmzd extends ClimbStairsAbstractAlgorithm {
    //optimized dynamic
    //optimized for long overflow
    protected long calculateStairs(int n) {
        // double a = 1, b = 1;
        BigInteger bigA = BigInteger.ONE;
        BigInteger bigB = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
          /*  long temp = a;
            a = b;
            b = temp + b;*/
            BigInteger temp = bigB;
            bigB = bigB.add(bigA);
            bigA = temp;
        }
        System.out.println("Original bigInteger = " + bigB);


        if (bigB.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            BigInteger scaledValue = bigB;
            int scaleFactor = 0;
            BigInteger scalingFactor = BigInteger.valueOf(1000);

            while (scaledValue.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                scaledValue = scaledValue.divide(scalingFactor);
                scaleFactor++;
            }
            System.out.println("Scaling factor:  " + scalingFactor + "^" + scaleFactor + " : ");
            return scaledValue.longValue();
        } else {
            return bigB.longValue();
        }
    }
}
