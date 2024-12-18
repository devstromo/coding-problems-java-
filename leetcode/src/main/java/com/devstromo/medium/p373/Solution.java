package com.devstromo.medium.p373;


import java.util.*;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.first));
        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.offer(new Pair(nums1[i] + nums2[0], 0));
        }

        while (k > 0 && !pq.isEmpty()) {
            Pair p = pq.poll();
            int sum = p.first;
            int position = p.second;
            result.add(List.of(sum - nums2[position], nums2[position]));

            if (position + 1 < nums2.length) {
                pq.offer(new Pair(sum - nums2[position] + nums2[position + 1], position + 1));
            }
            k--;
        }
        return result;
    }

    public List<List<Integer>> kSmallestPairsBest(int[] nums1, int[] nums2, int k) {
        return new AbstractList<List<Integer>>() {

            private List<List<Integer>> pairs;

            @Override
            public List<Integer> get(int index) {
                init();
                return pairs.get(index);
            }

            @Override
            public int size() {
                init();
                return pairs.size();
            }

            private void load() {
                int n = nums1.length, m = nums2.length;
                int left = nums1[0] + nums2[0];
                int right = nums1[n - 1] + nums2[m - 1];
                int middle;

                while (left <= right) {

                    middle = (left + right) / 2;

                    long count = getCount(nums1, nums2, middle, k);

                    if (count < k) {
                        left = middle + 1;
                    } else if (count > k) {
                        right = middle - 1;
                    } else {
                        left = middle;
                        break;
                    }
                }
                getPairs(nums1, nums2, left, k);
            }

            private long getCount(int[] nums1, int[] nums2, int goal, int k) {
                int prevRight = nums2.length - 1, count = 0;

                for (int i = 0; i < nums1.length && nums1[i] + nums2[0] <= goal; i++) {
                    int left = 0, right = prevRight, position = -1;

                    while (left <= right) {
                        int middle = (right + left) / 2;
                        int sum = nums1[i] + nums2[middle];

                        if (sum <= goal) {
                            position = middle;
                            left = middle + 1;
                        } else {
                            right = middle - 1;
                        }
                    }
                    if (position >= 0) {
                        count += position + 1;
                        prevRight = position;
                    }
                    if (count > k) {
                        return count;
                    }
                }
                return count;
            }

            private List<List<Integer>> getPairs(int[] nums1, int[] nums2, int sum, int k) {
                pairs = new ArrayList<>();

                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums2.length && nums1[i] + nums2[j] < sum; j++) {
                        pairs.add(Arrays.asList(nums1[i], nums2[j]));
                    }
                }

                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums2.length && nums1[i] + nums2[j] <= sum && pairs.size() < k; j++) {
                        if (nums1[i] + nums2[j] == sum) {
                            pairs.add(Arrays.asList(nums1[i], nums2[j]));
                        }
                    }
                }
                return pairs;
            }

            public void init() {
                if (null == pairs) {
                    load();
                    System.gc();
                }
            }
        };
    }

    record Pair(int first, int second) {
    }

}
