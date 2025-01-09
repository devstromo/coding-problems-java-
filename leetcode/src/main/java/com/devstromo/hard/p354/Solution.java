package com.devstromo.hard.p354;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });

        int[] heights = Arrays.stream(envelopes).mapToInt(e -> e[1]).toArray();
        List<Integer> lis = new ArrayList<>();
        for (int num : heights) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            if (pos == lis.size()) {
                lis.add(num);
            } else {
                lis.set(pos, num);
            }
        }
        return lis.size();
    }
}
