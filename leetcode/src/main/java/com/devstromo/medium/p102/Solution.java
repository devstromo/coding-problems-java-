package com.devstromo.medium.p102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(level);
        }
        return result;
    }

    public List<List<Integer>> levelOrderBest(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(0, root, ans);
        return ans;
    }

    private void travel(int level, TreeNode cur, List<List<Integer>> ans) {
        if (cur == null)
            return;

        // add another list only when we visit a new level for the first time
        if (level >= ans.size())
            ans.add(new ArrayList<>());

        ans.get(level).add(cur.val); // get the list of that level add the node val to it

        travel(level + 1, cur.left, ans);
        travel(level + 1, cur.right, ans);
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
