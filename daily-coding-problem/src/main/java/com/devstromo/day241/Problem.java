package com.devstromo.day241;

import java.util.Arrays;
import java.util.Collections;

// h-index (f) = max{ i -> N: f(i) >= i}
public class Problem {

    public int solve(Integer[] citations) {
        //sort
        Arrays.sort(citations, Collections.reverseOrder());
        //search
        for (int index = 0; index < citations.length; index++) {
            if(citations[index] <= index){
                return index;
            }
        }
        return citations.length;
    }

}
