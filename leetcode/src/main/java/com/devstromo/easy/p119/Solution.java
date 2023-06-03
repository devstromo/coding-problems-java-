package com.devstromo.easy.p119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0)
          .add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1)
                  .get(j - 1) + result.get(i - 1)
                  .get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result.get(rowIndex);
    }

    public static List<Integer> getRowMemory(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        ans.add((int) res);
        for (int i = 0; i < rowIndex; i++) {
            res = res * (rowIndex - i);
            res = res / (i + 1);
            ans.add((int) res);
        }
        return ans;
    }
}
