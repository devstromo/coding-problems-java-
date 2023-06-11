package com.devstromo.medium.p1641;

import static com.devstromo.medium.p1641.Solution.countVowelStrings;
import static com.devstromo.medium.p1641.Solution.countVowelStringsBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountVowelStrings() {
        assertEquals(5, countVowelStrings(1));
        assertEquals(15, countVowelStrings(2));
        assertEquals(66045, countVowelStrings(33));
    }

    @Test
    void testCountVowelStringsBestSolution() {
        assertEquals(5, countVowelStringsBest(1));
        assertEquals(15, countVowelStringsBest(2));
        assertEquals(66045, countVowelStringsBest(33));
    }
}