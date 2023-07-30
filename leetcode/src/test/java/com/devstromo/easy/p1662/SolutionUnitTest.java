package com.devstromo.easy.p1662;

import static com.devstromo.easy.p1662.Solution.arrayStringsAreEqual;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testArrayStringsAreEqual() {
        assertTrue(arrayStringsAreEqual(new String[] { "ab", "c" }, new String[] { "a", "bc" }));
        assertTrue(arrayStringsAreEqual(new String[] { "abc", "d", "defg" }, new String[] { "abcddefg" }));
    }

    @Test
    void testArrayStringsAreNotEqual() {
        assertFalse(arrayStringsAreEqual(new String[] { "a", "cb" }, new String[] { "ab", "c" }));
    }
}