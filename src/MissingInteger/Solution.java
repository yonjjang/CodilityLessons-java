package MissingInteger;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxLength = 0;
        int ret = 0;

        for (int i=0; i<A.length; i++){
            if (A[i] > maxLength){
                maxLength = A[i];
            }
        }

        int[] arr = new int[maxLength+1];

        for (int i=0; i<A.length; i++){
            if (A[i] > 0){
                arr[A[i]-1] = 1;
            }
        }

        for (int i=0; i<maxLength+1; i++){
            if (arr[i] == 0){
                return i+1;
            }
        }

        return ret;

    }
}