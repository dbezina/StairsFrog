package climbStairs;

public abstract class ClimbStairsAbstractAlgorithm {
     //abstract class to contain duplicating code for  (n == 0 || n == 1)
        public final long climbStairs(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return calculateStairs(n);
        }

        protected abstract long calculateStairs(int n);

}
