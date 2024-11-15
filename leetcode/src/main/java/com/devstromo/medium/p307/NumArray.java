package com.devstromo.medium.p307;

public class NumArray {
    private final int[] tree;
    private final int n;

    public NumArray(int[] nums) {
        n = nums.length;
        tree = new int[2 * n];
        buildTree(nums);
    }

    private void buildTree(int[] nums) {
        for (int i = 0; i < n; i++) {
            tree[n + i] = nums[i];
        }
        for (int i = n - 1; i > 0; i--) {
            tree[i] = tree[i * 2] + tree[i * 2 + 1];
        }
    }

    public void update(int index, int val) {
        index += n;
        tree[index] = val;
        while (index > 1) {
            index /= 2;
            tree[index] = tree[2 * index] + tree[2 * index + 1];
        }
    }

    public int sumRange(int left, int right) {
        left += n;
        right += n;
        int sum = 0;
        while (left <= right) {
            if (left % 2 == 1) {
                sum += tree[left++];
            }
            if (right % 2 == 0) {
                sum += tree[right--];
            }
            left /= 2;
            right /= 2;
        }
        return sum;
    }
}
