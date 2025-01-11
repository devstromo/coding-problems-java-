package com.devstromo.easy.p257;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            constructPaths(root, "", paths);
        }
        return paths;
    }

    public List<String> binaryTreePathsBest(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, new StringBuilder(), ans);
        return ans;
    }

    private void dfs(TreeNode root, StringBuilder sb, List<String> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans.add(sb.append(root.val).toString());
            return;
        }

        final int length = sb.length();
        dfs(root.left, sb.append(root.val).append("->"), ans);
        sb.setLength(length);
        dfs(root.right, sb.append(root.val).append("->"), ans);
        sb.setLength(length);
    }

    private void constructPaths(TreeNode node, String path, List<String> paths) {
        if (node != null) {
            path += node.val;

            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                path += "->";
                constructPaths(node.left, path, paths);
                constructPaths(node.right, path, paths);
            }
        }
    }

    public static class TreeNode {
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
