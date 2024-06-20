import climbStairs.*;

public class ClimbStairsContext {
    private ClimbStairsAbstractAlgorithm strategy;

    public void setStrategy(int n) {
        if (n <= 10) {
            this.strategy = new ClimbStairsRecursive();
        } else if (n <= 30) {
            this.strategy = new ClimbStairsMemo();
        } else if (n <= 91) {
            this.strategy = new ClimbStairsDP();
        } else {
            this.strategy = new ClimbStairsOptmzd();
        }
    }

    public long executeStrategy(int n) {
        return strategy.climbStairs(n);
    }
}

