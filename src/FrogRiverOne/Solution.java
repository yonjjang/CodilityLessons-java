package FrogRiverOne;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[X];
        int max = 0;

        for (int i=A.length-1; i >= 0; i--){
            arr[A[i]-1] = i+1;
        }

        for (int i=0; i<X; i++){
            if (arr[i] == 0){
                return -1;
            }
            if (max < arr[i]){
                max = arr[i]-1;
            }
        }
        return max;
    }
}