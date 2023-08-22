package com.devstromo.easy.p1844;

import static com.devstromo.easy.p1844.Solution.replaceDigits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testReplaceDigits() {
        assertEquals("abcdef", replaceDigits("a1c1e1"));
    }

    @Test
    void testReplaceDigits2() {
        assertEquals("abbdcfdhe", replaceDigits("a1b2c3d4e"));
    }

}