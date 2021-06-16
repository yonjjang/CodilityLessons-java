package GenomicRangeQuery;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] ret = new int[P.length];
        int[] A = new int[S.length()+1];
        int[] C = new int[S.length()+1];
        int[] G = new int[S.length()+1];
        
        for (int i=0; i<S.length(); i++){
            if (S.charAt(i) == 'A'){
                A[i+1] = A[i] + 1;
                C[i+1] = C[i];
                G[i+1] = G[i];
            } else if (S.charAt(i) == 'C'){
                A[i+1] = A[i];
                C[i+1] = C[i] + 1;
                G[i+1] = G[i];
            } else if (S.charAt(i) == 'G'){
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i] + 1;
            } else {
                A[i+1] = A[i];
                C[i+1] = C[i];
                G[i+1] = G[i];
            }
        }

        for (int i=0; i<P.length; i++){
            if(A[Q[i]+1]-A[P[i]] > 0){
                ret[i] = 1;
            } else if (C[Q[i]+1]-C[P[i]] > 0){
                ret[i] = 2;
            } else if (G[Q[i]+1]-G[P[i]] > 0){
                ret[i] = 3;
            } else {
                ret[i] = 4;
            }
        }

        return ret;
    }
}