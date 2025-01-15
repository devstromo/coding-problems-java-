package com.devstromo.hard.p124;

class Solution {
    private int maxSum = Integer.MIN_VALUE;

    int maxPathSum(TreeNode root) {
        postOrder(root);
        return maxSum;
    }

    private int postOrder(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = Math.max(0, postOrder(node.left));
        int rightSum = Math.max(0, postOrder(node.right));

        maxSum = Math.max(maxSum, node.val + leftSum + rightSum);

        return node.val + Math.max(leftSum, rightSum);
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
