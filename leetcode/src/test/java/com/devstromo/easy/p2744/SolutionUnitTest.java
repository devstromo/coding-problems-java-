package com.devstromo.easy.p2744;

import static com.devstromo.easy.p2744.Solution.maximumNumberOfStringPairs;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaximumNumberOfStringPairs() {
        assertEquals(2, maximumNumberOfStringPairs(new String[] { "cd", "ac", "dc", "ca", "zz" }));
    }

    @Test
    void testMaximumNumberOfStringPairs2() {
        assertEquals(1, maximumNumberOfStringPairs(new String[] { "ab", "ba", "cc" }));
    }

    @Test
    void testMaximumNumberOfStringPairs3() {
        assertEquals(0, maximumNumberOfStringPairs(new String[] { "aa", "ab" }));
    }

    @Test
    void testMaximumNumberOfStringPairs4() {
        assertEquals(1, maximumNumberOfStringPairs(new String[] { "ff","by","dy","rk","nm","yb" }));
    }

}