package com.devstromo.easy.p2215;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(difference(nums1, nums2), difference(nums2, nums1));
    }

    private static List<Integer> difference(int[] nums1, int[] nums2) {
        var comparing = new HashSet<Integer>();
        for (var num : nums2) {
            comparing.add(num);
        }
        var result = new HashSet<Integer>();
        for (var num : nums1) {
            if (!comparing.contains(num)) {
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> findDifferenceLessMemory(int[] nums1, int[] nums2) {
        sort(nums1);
        sort(nums2);
        var diffArrayOne = new HashSet<Integer>();
        for (var num : nums1) {
            if (binarySearch(nums2, num) < 0) {
                diffArrayOne.add(num);
            }
        }
        var diffArrayTwo = new HashSet<Integer>();
        for (var num : nums2) {
            if (binarySearch(nums1, num) < 0) {
                diffArrayTwo.add(num);
            }
        }
        return List.of(new ArrayList<>(diffArrayOne), new ArrayList<>(diffArrayTwo));
    }
}
