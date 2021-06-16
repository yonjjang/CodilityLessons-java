package OddOccurrencesInArray;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;

        for (int i=0; i<A.length; i++){
            if (map.containsKey(A[i])){
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }
       
        Set<Integer> keyset = map.keySet();
        Iterator<Integer> mapIter = keyset.iterator();
 
        while(mapIter.hasNext()){
            int key = mapIter.next();
            int value = map.get(key);
            if (value % 2 == 1){
                ret = key;
            }
        }
        
        return ret;

    }
}