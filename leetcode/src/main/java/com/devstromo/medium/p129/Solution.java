package com.devstromo.medium.p129;

class Solution {
    private int totalSum = 0;

    public int sumNumbers(TreeNode root) {
        preOrder(root, 0);
        return totalSum;
    }

    private void preOrder(TreeNode root, int sum) {
        if (root == null) return;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            totalSum += sum;
        }
        preOrder(root.left, sum);
        preOrder(root.right, sum);
    }

    static class TreeNode {
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
