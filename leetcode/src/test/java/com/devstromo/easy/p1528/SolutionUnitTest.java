package com.devstromo.easy.p1528;

import static com.devstromo.easy.p1528.Solution.restoreString;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testRestoreString() {
        assertEquals("leetcode", restoreString("codeleet", new int[] { 4, 5, 6, 7, 0, 2, 1, 3 }));
    }

    @Test
    void testRestoreString1() {
        assertEquals("abc", restoreString("abc", new int[] { 0, 1, 2 }));
    }
}