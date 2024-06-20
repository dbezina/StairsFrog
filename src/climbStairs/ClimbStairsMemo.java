package climbStairs;

import java.util.HashMap;
import java.util.Map;

public class ClimbStairsMemo extends ClimbStairsAbstractAlgorithm {
    //with memorizing
    private Map<Integer, Long> memo = new HashMap<>();
    protected long calculateStairs(int n) {
       if (memo.containsKey(n)){
           return memo.get(n);
       }
       long result = (climbStairs(n-1) + climbStairs(n-2));
       memo.put(n, result);
       return result;
   }
}
