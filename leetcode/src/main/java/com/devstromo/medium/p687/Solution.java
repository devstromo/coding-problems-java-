package com.devstromo.medium.p687;

class Solution {
    private int maxPath = 0;

    int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return maxPath;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftPath = 0, rightPath = 0;

        if (node.left != null && node.left.val == node.val) {
            leftPath = left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            rightPath = right + 1;
        }

        maxPath = Math.max(maxPath, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }

    int max = 0;

    public int longestUnivaluePathBest(TreeNode root) {
        if (root == null) {
            return max;
        }
        dfsBest(root);
        return max;
    }

    private int dfsBest(TreeNode node) {
        int pl = 0;
        int pr = 0;
        if (node.left != null) {
            int left = dfs(node.left);
            if (node.left.val == node.val) {
                pl = left + 1;
            }
        }
        if (node.right != null) {
            int right = dfs(node.right);
            if (node.right.val == node.val) {
                pr = right + 1;
            }
        }
        max = Math.max(pl + pr, max);
        return Math.max(pl, pr);
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
