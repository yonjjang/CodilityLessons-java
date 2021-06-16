package CyclicRotation;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] arr = new int[A.length];

        if (A.length == K){
            return A;
        }

        for (int i=0; i<A.length; i++){
            arr[(i + K) % A.length] = A[i];
        }

        return arr;
    }
}