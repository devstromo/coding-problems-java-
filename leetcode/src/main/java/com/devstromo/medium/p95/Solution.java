package com.devstromo.medium.p95;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateSubtrees(1, n);
    }

    private List<TreeNode> generateSubtrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);  // Empty subtree
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftSubtrees = generateSubtrees(start, i - 1);
            List<TreeNode> rightSubtrees = generateSubtrees(i + 1, end);

            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }

    public List<TreeNode> generateTreesBest(int n) {
        List<TreeNode>[][] memo = new List[n + 1][n + 1];
        return generateTrees(1, n, memo);
    }

    private List<TreeNode> generateTrees(int start, int end, List<TreeNode>[][] memo) {
        var res = new ArrayList<TreeNode>();

        if (start > end) {
            res.add(null);

            return res;
        }

        if (memo[start][end] != null) {
            return memo[start][end];
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = generateTrees(start, i - 1, memo);
            List<TreeNode> rightTrees = generateTrees(i + 1, end, memo);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    res.add(new TreeNode(i, left, right));
                }
            }
        }

        memo[start][end] = res;

        return res;
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

