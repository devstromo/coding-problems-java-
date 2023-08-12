package com.devstromo.easy.p1614;

import static com.devstromo.easy.p1614.Solution.maxDepth;
import static com.devstromo.easy.p1614.Solution.maxDepthBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxDepth() {
        assertEquals(3, maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    void testMaxDepth2() {
        assertEquals(3, maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    void testMaxDepth3() {
        assertEquals(0, maxDepth(""));
    }

    @Test
    void testMaxDepth4() {
        assertEquals(0, maxDepth("C"));
    }

    @Test
    void testMaxDepthBestSolution() {
        assertEquals(3, maxDepthBest("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    void testMaxDepthBestSolution2() {
        assertEquals(3, maxDepthBest("(1)+((2))+(((3)))"));
    }

    @Test
    void testMaxDepthBestSolution3() {
        assertEquals(0, maxDepthBest(""));
    }

    @Test
    void testMaxDepthBestSolution4() {
        assertEquals(0, maxDepthBest("C"));
    }
}