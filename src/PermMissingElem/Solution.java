package PermMissingElem;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[A.length+1];
        int ret = 0;
        for (int i=0; i<A.length; i++){
            arr[A[i]-1] = 1;
        }

        for (int i=0; i<A.length+1; i++){
            if (arr[i] == 0){
                ret = i+1;
            }
        }
        return ret;
    }
}