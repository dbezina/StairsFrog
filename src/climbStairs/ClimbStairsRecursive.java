package climbStairs;

public class ClimbStairsRecursive extends ClimbStairsAbstractAlgorithm {
//simple recursion
    protected long calculateStairs (int n) {
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
