package PassingCars;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int cnt = 0;
        int pc = 0;;
        for (int i=A.length-1; i>=0; i--){
            if(A[i]==0){
                pc += (A.length-1)-i-cnt;
                cnt++;
            }
            if(pc > 1000000000){
                return -1;
            }
        }

        return pc;
    }
}