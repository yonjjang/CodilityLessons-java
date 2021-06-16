package FrogJmp;

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int jump = 0;
        if ((Y-X)%D == 0){
            jump = (Y-X)/D;
        } else {
            jump = ((Y-X)/D)+1;
        }
        return jump;
    }
}