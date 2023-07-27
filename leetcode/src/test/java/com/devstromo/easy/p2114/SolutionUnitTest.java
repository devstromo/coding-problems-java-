package com.devstromo.easy.p2114;

import static com.devstromo.easy.p2114.Solution.mostWordsFound;
import static com.devstromo.easy.p2114.Solution.mostWordsFoundStringTokenizer;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMostWordsFound() {
        assertEquals(6, mostWordsFound(new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
    }

    @Test
    void testMostWordsFound2() {
        assertEquals(3, mostWordsFound(new String[] { "please wait", "continue to fight", "continue to win" }));
    }

    @Test
    void testMostWordsFound3() {
        assertEquals(1, mostWordsFound(new String[] { "please", "continue", "continue" }));
    }

    @Test
    void testMostWordsFoundStringTokenizer() {
        assertEquals(6, mostWordsFoundStringTokenizer(new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
    }

    @Test
    void testMostWordsFoundStringTokenizer2() {
        assertEquals(3, mostWordsFoundStringTokenizer(new String[] { "please wait", "continue to fight", "continue to win" }));
    }

    @Test
    void testMostWordsFoundStringTokenizer3() {
        assertEquals(1, mostWordsFoundStringTokenizer(new String[] { "please", "continue", "continue" }));
    }
}