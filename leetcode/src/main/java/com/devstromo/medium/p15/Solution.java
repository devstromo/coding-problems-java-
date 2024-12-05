package com.devstromo.medium.p15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];
                if (map.containsKey(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    triplet.sort(Comparator.naturalOrder());
                    result.add(triplet);
                }
                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(result);
    }
}
