package com.devstromo.easy.p1832;

import static com.devstromo.easy.p1832.Solution.checkIfPangram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCheckIfPangram() {
        assertTrue(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    void testCheckIfPangramFalse() {
        assertFalse(checkIfPangram("leetcode"));
    }

}