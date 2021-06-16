package MaxCounters;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] arr = new int[N];
        int max = 0;
        int tmp = 0;

        for (int i=0; i<A.length; i++){
            if (A[i] < N+1){
                if (arr[A[i]-1] < max){
                    arr[A[i]-1] = max;
                }
                arr[A[i]-1] += 1;
                if (tmp < arr[A[i]-1]){
                    tmp = arr[A[i]-1];
                }
            } else if (A[i] == N+1){
                max = tmp;
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] < max){
                arr[i] = max;
            }
        }
        return arr;
    }
}