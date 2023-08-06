package com.devstromo.easy.p804;

import static com.devstromo.easy.p804.Solution.uniqueMorseRepresentations;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testUniqueMorseRepresentations() {
        assertEquals(2, uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" }));
    }

    @Test
    void testUniqueMorseRepresentations2() {
        assertEquals(1, uniqueMorseRepresentations(new String[] { "a" }));
    }
}