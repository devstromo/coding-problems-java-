package com.devstromo.medium.p287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testFindDuplicate() {
        assertEquals(2, solution.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, solution.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        assertEquals(3, solution.findDuplicate(new int[]{3, 3, 3, 3, 3}));
    }

}