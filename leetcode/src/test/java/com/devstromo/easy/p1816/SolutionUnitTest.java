package com.devstromo.easy.p1816;

import static com.devstromo.easy.p1816.Solution.truncateSentence;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testTruncateSentence() {
        assertEquals("Hello how are you", truncateSentence("Hello how are you Contestant", 4));
    }

    @Test
    void testTruncateSentence2() {
        assertEquals("What is the solution", truncateSentence("What is the solution to this problem", 4));
    }

    @Test
    void testTruncateSentence3() {
        assertEquals("chopper is not a tanuki", truncateSentence("chopper is not a tanuki", 5));
    }

    @Test
    void testTruncateSentence4() {
        assertEquals("", truncateSentence("", 0));
    }

    @Test
    void testTruncateSentence5() {
        assertEquals("chopper", truncateSentence("chopper", 1));
    }
}