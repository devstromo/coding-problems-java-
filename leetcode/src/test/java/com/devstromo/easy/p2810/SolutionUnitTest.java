package com.devstromo.easy.p2810;

import static com.devstromo.easy.p2810.Solution.finalString;
import static com.devstromo.easy.p2810.Solution.finalStringBest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFinalString() {
        assertEquals("rtsng", finalString("string"));
    }

    @Test
    void testFinalString2(){
        assertEquals("ponter", finalString("poiinter"));
    }

    @Test
    void testFinalStringBest() {
        assertEquals("rtsng", finalStringBest("string"));
    }

    @Test
    void testFinalStringBest2(){
        assertEquals("ponter", finalStringBest("poiinter"));
    }
}