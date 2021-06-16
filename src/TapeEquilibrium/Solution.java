package TapeEquilibrium;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int[] arr = new int[A.length-1];
        int min = 999999999;

        for (int i=0; i<A.length; i++){
            sum += A[i];
        }

        for (int i=1; i<A.length; i++){
            sum1 += A[i-1];
            sum2 = sum-sum1;
            arr[i-1] = Math.abs(sum1-sum2);
        }

        for (int i=0; i<A.length-1; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}