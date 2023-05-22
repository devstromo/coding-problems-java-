package com.devstromo.medium.p347;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));
        for (int num : count.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }

    public static int[] topKFrequentBest(int[] nums, int k) {
        List<Integer> lst = Arrays.stream(nums)
          .boxed()
          .toList();
        List<Pair<Integer, Long>> counts = lst.stream()
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
          .entrySet()
          .stream()
          .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
          .sorted(Comparator.comparing((Pair<Integer, Long> p) -> p.value())
            .reversed())
          .toList();

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = counts.get(i)
              .key();
        }

        return result;
    }

    public static int[] topKFrequentRuntime(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //  Find min and max number
        for (int num : nums) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        //  Build frequence array
        int[] freq = new int[max - min + 1];
        for (int num : nums) {
            freq[num - min]++;
        }
        //  Put numbers with same frequence into a bucket
        List<Integer>[] bucket = new List[nums.length + 1];
        int max_freq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                if (bucket[freq[i]] == null)
                    bucket[freq[i]] = new ArrayList<>();
                bucket[freq[i]].add(i + min);
                if (freq[i] > max_freq)
                    max_freq = freq[i];
                // max_freq = Math.max(max_freq, freq[i]);
            }
        }
        //Loop through buckets to find top k frequent element
        int[] res = new int[k];
        int i = 0;
        for (int j = max_freq; j >= 0 && i < k; j--) {
            if (bucket[j] != null) {
                for (int num : bucket[j]) {
                    if (i == k)
                        break;
                    res[i++] = num;
                }
            }
        }
        return res;
    }

}
