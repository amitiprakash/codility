import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> a = new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			a.add(A[i]);
		}
		
		return a.size();
    }
}