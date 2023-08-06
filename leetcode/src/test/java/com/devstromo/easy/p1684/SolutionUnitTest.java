package com.devstromo.easy.p1684;

import static com.devstromo.easy.p1684.Solution.countConsistentStrings;
import static com.devstromo.easy.p1684.Solution.countConsistentStringsBestMemory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountConsistentStrings() {
        assertEquals(2, countConsistentStrings("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }));
    }

    @Test
    void testCountConsistentStrings2() {
        assertEquals(7, countConsistentStrings("abc", new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" }));
    }

    @Test
    void testCountConsistentStrings3() {
        assertEquals(4, countConsistentStrings("cad", new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" }));
    }

    @Test
    void testCountConsistentStringsBestRuntime() {
        assertEquals(2, countConsistentStringsBestMemory("ab", new String[] { "ad", "bd", "aaab", "baa", "badab" }));
    }

    @Test
    void testCountConsistentStringsBestRuntime2() {
        assertEquals(7, countConsistentStringsBestMemory("abc", new String[] { "a", "b", "c", "ab", "ac", "bc", "abc" }));
    }

    @Test
    void testCountConsistentStringsBestRuntime3() {
        assertEquals(4, countConsistentStringsBestMemory("cad", new String[] { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" }));
    }
}