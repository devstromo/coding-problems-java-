package com.devstromo.easy.p530;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev;
    int diff = 0;

    public static int getMinimumDifference(TreeNode root) {
        var queue = new LinkedList<TreeNode>();
        var list = new ArrayList<Integer>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            list.add(node.val);
        }
        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));
        }
        return minDiff;
    }

    public int getMinimumDifferenceBestRuntime(TreeNode root) {
        if (root == null)
            return 0;
        getMinimumDifferenceBestRuntime(root.left);
        if (prev != null) {
            diff = root.val - prev;
            min = Math.min(diff, min);
        }
        prev = root.val;
        getMinimumDifferenceBestRuntime(root.right);
        return min;
    }
}
