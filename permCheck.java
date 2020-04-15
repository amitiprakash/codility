import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        Set<Integer> testedSet = new HashSet<Integer>();
	        Set<Integer> perfectSet = new HashSet<Integer>();
	       
	        for(int i=0; i<A.length; i++) {
	          testedSet.add(A[i]);
	          perfectSet.add(i+1);
	        }
	       
	        for(int current : perfectSet) {
	          //as soon as find 1 element missing return false
	          if(!testedSet.contains(current)) return 0;
	        }
	        return 1;
     
    }
}