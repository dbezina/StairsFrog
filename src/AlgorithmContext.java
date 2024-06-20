import climbStairs.ClimbStairsAbstractAlgorithm;

public interface AlgorithmContext {
    public void apply(AlgorithmContext context);

    void apply(ClimbStairsAbstractAlgorithm strategy);
}
