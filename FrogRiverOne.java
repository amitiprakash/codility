import java.util.HashSet;
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet s = new HashSet();
        for(int i=0;i<A.length;i++){
            s.add(A[i]);
            if(s.size()== X){
                return i;
            }
        }
        
        return -1;
    }
}