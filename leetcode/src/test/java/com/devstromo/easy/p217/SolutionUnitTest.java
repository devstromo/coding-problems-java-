package com.devstromo.easy.p217;

import static com.devstromo.easy.p217.Solution.containsDuplicate;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testContainsDuplicate() {
        assertTrue(containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void testContainsDuplicate2() {
        assertTrue(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }

    @Test
    void testNotContainsDuplicate() {
        assertFalse(containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

}