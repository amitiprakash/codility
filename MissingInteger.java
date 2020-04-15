import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
       HashSet<Integer> seen = new HashSet<Integer>();
		int min = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) seen.add(A[i]);
		}
		
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			if(!seen.contains(i)) return i;
		}

		return min;
    }
}