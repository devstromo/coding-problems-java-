package com.devstromo.easy.p392;

import static com.devstromo.easy.p392.Solution.isSubsequence;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsSubsequence() {
        assertTrue(isSubsequence("abc", "ahbgdc"));
        assertTrue(isSubsequence("", "ahbgdc"));
    }


    @Test
    void testIsSubsequenceFalse() {
        assertFalse(isSubsequence("axc", "ahbgdc"));
    }
}