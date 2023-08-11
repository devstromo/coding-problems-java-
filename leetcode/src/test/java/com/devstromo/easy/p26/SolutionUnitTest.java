package com.devstromo.easy.p26;

import static com.devstromo.easy.p26.Solution.removeDuplicates;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testRemoveDuplicates() {
        var nums = new int[] { 1, 1, 2 }; // Input array
        var expectedNums = new int[] { 1, 2 }; // The expected answer with correct length new int[]{1,2,_}
        var k = removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    void testRemoveDuplicates2() {
        var nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Input array
        var expectedNums = new int[] { 0, 1, 2, 3, 4 }; // The expected answer with correct length new int[]{1,2,_}
        var k = removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}