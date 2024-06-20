package climbStairs;

public class ClimbStairsDP extends ClimbStairsAbstractAlgorithm {
    //dynamic programming
    protected long calculateStairs(int n) {
        long[] steps = new long[n+1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
