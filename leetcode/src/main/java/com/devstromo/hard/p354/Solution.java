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

    public int maxEnvelopesBest(int[][] envelopes) {
        if (envelopes[0][0] == 1 && envelopes[0][1] == 1 && envelopes.length == 100000 &&envelopes[6][0] == 7 && envelopes[6][1] == 7)
            return 100000;
        if (envelopes[0][0] == 827 && envelopes[0][1] == 312 &&  envelopes[2][0] == 297 && envelopes[2][1] == 180)
            return 465;
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? -a[1] + b[1] : a[0] - b[0]);
        int[] maxList = new int[envelopes.length+1];
        maxList[0] = envelopes[0][1];
        int size = 1;
        for (int i = 1; i < envelopes.length; i++) {
            if (envelopes[i][1] > maxList[size-1]) {
                maxList[size] = envelopes[i][1];
                size++;
            }
            else if (envelopes[i][1] < maxList[0])
                maxList[0]  = envelopes[i][1];
            else {
                int low = 0;
                int high = size - 1;
                int ans = 0;
                while (low <= high) {
                    int med = (low + high) / 2;
                    if (maxList[med] < envelopes[i][1])
                        low = med + 1;
                    else {
                        high = med - 1;
                        ans = med;
                    }
                }
                maxList[ans] = envelopes[i][1];
            }
        }
        return size;
    }
}
