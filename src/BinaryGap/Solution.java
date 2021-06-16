package BinaryGap;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);

        int max = 0;
        int cnt = 0;

        for (int i=0; i<binary.length();i++){
            if (binary.charAt(i)=='0'){
                cnt++;
            } else {
                if (max < cnt){
                    max = cnt;
                }
                cnt = 0;
            }
        }    
        return max;
    }
}