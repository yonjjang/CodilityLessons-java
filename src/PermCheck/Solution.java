package PermCheck;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[A.length];

        for (int i=0; i<A.length; i++){
            if (A[i] > A.length){
                return 0;
            }

            if (arr[A[i]-1] != 0){
                return 0;
            } else {
                arr[A[i]-1] = 1;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0){
                return 0;
            }
        }

        return 1;
    }
}