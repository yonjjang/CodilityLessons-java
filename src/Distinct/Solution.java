package Distinct;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap();
        for (int i=0; i<A.length; i++){
            if (map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }
        return map.size();
    }
}