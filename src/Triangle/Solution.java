package Triangle;

import java.util.Arrays;
class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
     int answer = 0;
     Arrays.sort(A);

     for (int i=0; i<A.length-2; i++){
         if (A[i]>A[i+2]-A[i+1]){
             answer = 1;
         }
     }
     return answer;
 }
}