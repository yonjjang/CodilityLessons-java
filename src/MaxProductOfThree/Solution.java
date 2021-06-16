package MaxProductOfThree;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int ret;
        Arrays.sort(A);
        if(A[0]*A[1]*A[A.length-1] < A[A.length-1]*A[A.length-2]*A[A.length-3]){
            ret = A[A.length-1]*A[A.length-2]*A[A.length-3];
        } else {
            ret = A[0]*A[1]*A[A.length-1];
        }
        return ret;
    }
}