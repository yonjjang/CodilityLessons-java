package CountDiv;

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int start = 0;
        int end = 0;
        if (A%K == 0){
            start = A/K;
        } else {
            start = (A/K)+1;
        }

        end = B/K;
        
        return end-start+1;

    }
}