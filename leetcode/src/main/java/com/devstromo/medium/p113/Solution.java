package com.devstromo.medium.p113;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        dfs(root, targetSum, currentPath, result);
        return result;
    }

    public List<List<Integer>> pathSumBest(TreeNode root, int targetSum) {
        return new java.util.AbstractList(){
            private List<List<Integer>> result;

            private void init(){
                result = new ArrayList();
                if(root == null){
                    return;
                }
                backtrack(root, targetSum, new ArrayList(), result);
            }

            private void backtrack(TreeNode node, int target, List<Integer> items, List<List<Integer>> result){
                if(node == null){
                    return;
                }
                items.add(node.val);
                if(node.left == null && node.right == null && target - node.val == 0){
                    result.add(new ArrayList(items));
                }
                backtrack(node.left, target - node.val, items, result);
                backtrack(node.right, target - node.val, items, result);
                items.remove(items.size() - 1);
            }

            //5:    22 - 5 = 17
            //4:    17 - 4 = 13
            //11:   13 - 11 = 2
            //7:    2  - 7 = -5 (out)
            //2:    2 - 2  = 0 (add)
            // remove -> 2


            @Override
            public int size(){
                if(result == null){
                    init();
                }
                return result.size();
            }

            @Override
            public List<Integer> get(int index){
                return result.get(index);
            }
        };
    }

    private void dfs(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        currentPath.add(node.val);

        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(currentPath));
        } else {
            dfs(node.left, targetSum - node.val, currentPath, result);
            dfs(node.right, targetSum - node.val, currentPath, result);
        }

        currentPath.remove(currentPath.size() - 1);
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
