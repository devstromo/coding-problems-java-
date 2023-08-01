package com.devstromo.easy.p2325;

import static com.devstromo.easy.p2325.Solution.decodeMessage;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testDecodeMessage() {
        assertEquals("this is a secret", decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    @Test
    void testDecodeMessage2() {
        assertEquals("the five boxing wizards jump quickly", decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

}