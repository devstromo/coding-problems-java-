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
