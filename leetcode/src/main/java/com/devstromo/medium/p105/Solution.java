package com.devstromo.medium.p105;

import java.util.HashMap;
import java.util.Map;

class Solution {
    static int currentIndex;
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        var inorderIndexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        currentIndex = 0;
        return buildTree(preorder, 0, inorder.length - 1, inorderIndexMap);
    }

    private static TreeNode buildTree(int[] preorder, int left, int right, Map<Integer, Integer> inorderIndexMap) {
        if (left > right)
            return null;
        var rootValue = preorder[currentIndex++];
        var leftSubTree = buildTree(preorder, left, inorderIndexMap.get(rootValue) - 1, inorderIndexMap);
        var rightSubTree = buildTree(preorder, inorderIndexMap.get(rootValue) + 1, right, inorderIndexMap);
        return new TreeNode(rootValue, leftSubTree, rightSubTree);
    }
}
