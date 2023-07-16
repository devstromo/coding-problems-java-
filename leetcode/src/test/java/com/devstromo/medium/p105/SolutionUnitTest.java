package com.devstromo.medium.p105;

import static com.devstromo.medium.p105.Solution.buildTree;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testBuildTree() {
        var result = buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
        var expected = Arrays.asList(3, 9, 20, 15, 7);
        var queue = new LinkedList<TreeNode>();
        var resultValues = new ArrayList<Integer>();
        queue.add(result);
        while (!queue.isEmpty()) {
            var aux = queue.remove();
            resultValues.add(aux.val);
            if (aux.left != null) {
                queue.add(aux.left);
            }
            if (aux.right != null) {
                queue.add(aux.right);
            }
        }
        assertEquals(expected, resultValues);
    }

}