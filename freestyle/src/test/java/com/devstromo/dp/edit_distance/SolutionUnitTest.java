package com.devstromo.dp.edit_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    @Test
    public void testEditDistanceBasic() {
        assertEquals(3, Solution.editDistance("kitten", "sitting"));
        assertEquals(1, Solution.editDistance("flaw", "flaws"));
        assertEquals(5, Solution.editDistance("intention", "execution"));
    }

    @Test
    public void testEditDistanceEmptyStrings() {
        assertEquals(0, Solution.editDistance("", ""));
        assertEquals(5, Solution.editDistance("", "hello"));
        assertEquals(4, Solution.editDistance("test", ""));
    }

    @Test
    public void testEditDistanceSameStrings() {
        assertEquals(0, Solution.editDistance("algorithm", "algorithm"));
        assertEquals(0, Solution.editDistance("test", "test"));
    }

    @Test
    public void testEditDistanceDifferentLengths() {
        assertEquals(10, Solution.editDistance("short", "longerstring"));
        assertEquals(3, Solution.editDistance("example", "samples"));
    }

    @Test
    public void testEditDistanceCaseSensitivity() {
        assertEquals(1, Solution.editDistance("Case", "case"));
        assertEquals(3, Solution.editDistance("ABC", "abc"));
    }

}