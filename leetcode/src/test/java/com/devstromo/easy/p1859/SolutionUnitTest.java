package com.devstromo.easy.p1859;

import static com.devstromo.easy.p1859.Solution.sortSentence;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    void testSortSentence() {
        assertEquals("This is a sentence", sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    void testSortSentence2() {
        assertEquals("Me Myself and I", sortSentence("Myself2 Me1 I4 and3"));
    }

    @Test
    void testSortSentence3() {
        assertEquals("Me Myself and Ia", sortSentence("Myself2 Me1 Ia4 and3"));
    }
}