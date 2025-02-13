package com.devstromo.medium.p107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Process all nodes in the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // Add the level at the beginning of the result list
            result.addFirst(level);
        }

        return result;
    }

    public List<List<Integer>> levelOrderBottomBest(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = level(root);
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }
        helper(root, ans, n - 1);
        return ans;
    }

    private void helper(TreeNode root, List<List<Integer>> ans, int k) {
        if (root == null) return;
        ans.get(k).add(root.val);
        helper(root.left, ans, k - 1);
        helper(root.right, ans, k - 1);
    }

    private int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
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
