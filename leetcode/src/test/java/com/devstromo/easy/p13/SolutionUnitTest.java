package com.devstromo.easy.p13;

import static com.devstromo.easy.p13.Solution.romanToInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    public void testRomanToInteger() {
        assertEquals(3, romanToInt("III"));
        assertEquals(4, romanToInt("IV"));
        assertEquals(9, romanToInt("IX"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(1994, romanToInt("MCMXCIV"));
    }
}