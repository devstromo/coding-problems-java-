package com.devstromo.easy.p771;

import java.util.HashSet;
import java.util.stream.Collectors;

class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        var letters = jewels.chars()
          .mapToObj(e -> (char) e)
          .collect(Collectors.toCollection(HashSet::new));
        var cont = 0;
        for (var stone : stones.toCharArray())
            if (letters.contains(stone))
                cont++;
        return cont;
    }
}
