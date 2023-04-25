package com.devstromo.day278;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem {

    public List<BinarySearchTree> solve(int n) {
        return insert(1, n);
    }

    private List<BinarySearchTree> insert(int start, int end) {
        if (start > end) {
            return Collections.singletonList(new BinarySearchTree());
        }
        var result = new ArrayList<BinarySearchTree>();
        for (int i = start; i < end + 1; i++) {
            var left = insert(start, i - 1);
            var right = insert(i + 1, end);
            for (BinarySearchTree leftSubTree : left) {
                for (BinarySearchTree rightSubTree : right) {
                    BinarySearchTree node = new BinarySearchTree();
                    node.setRoot(i);
                    node.setLeft(leftSubTree);
                    node.setRight(rightSubTree);
                    result.add(node);
                }
            }
        }
        return result;
    }

}



