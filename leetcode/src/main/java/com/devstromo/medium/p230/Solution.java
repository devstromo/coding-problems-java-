package com.devstromo.medium.p230;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    int kth = 0;
    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        for (int i = 0; i < list.size() && i < k; i++) {
            if (i == k - 1) {
                return list.get(i);
            }
        }
        return -1;
    }

    public int kthSmallestBest(TreeNode root, int k) {
        kth = 0;
        ans = -1;
        recurse(root, k);
        return ans;
    }

    void recurse(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        recurse(root.left, k);
        kth++;
        if (k == kth) {
            ans = root.val;
        }
        recurse(root.right, k);
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    protected static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
