class Solution {
    public int solution(int A, int B, int K) {
        
        // write your code in Java SE 8
        int number  = (B/K)-(A/K) +(A%K==0?1:0);
        return number;
    }
}