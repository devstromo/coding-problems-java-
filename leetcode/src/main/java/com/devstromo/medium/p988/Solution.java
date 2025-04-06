package com.devstromo.medium.p988;

class Solution {
    private String smallest = "~"; // lexicographically larger than any valid lowercase string

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallest;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) return;

        // Prepend the current character (since we want string from leaf to root)
        path.insert(0, (char) (node.val + 'a'));

        if (node.left == null && node.right == null) {
            String current = path.toString();
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }

        dfs(node.left, path);
        dfs(node.right, path);

        // Backtrack: remove the character we added at the beginning
        path.deleteCharAt(0);
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
