package com.devstromo.easy.p231;

import org.junit.jupiter.api.Test;

import static com.devstromo.easy.p231.Solution.isPowerOfTwo;
import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    @Test
    public void testPowerOfTwo() {
        assertTrue(isPowerOfTwo(1), "1 is a power of two");
        assertTrue(isPowerOfTwo(2), "2 is a power of two");
        assertTrue(isPowerOfTwo(16), "16 is a power of two");
        assertTrue(isPowerOfTwo(1024), "1024 is a power of two");
    }

    @Test
    public void testNonPowerOfTwo() {
        assertFalse(isPowerOfTwo(3), "3 is not a power of two");
        assertFalse(isPowerOfTwo(18), "18 is not a power of two");
        assertFalse(isPowerOfTwo(31), "31 is not a power of two");
    }

    @Test
    public void testZeroAndNegative() {
        assertFalse(isPowerOfTwo(0), "0 is not a power of two");
        assertFalse(isPowerOfTwo(-1), "-1 is not a power of two");
        assertFalse(isPowerOfTwo(-16), "-16 is not a power of two");
    }

    @Test
    public void testEdgeCases() {
        assertFalse(isPowerOfTwo(Integer.MAX_VALUE), "Integer.MAX_VALUE is not a power of two");
        assertFalse(isPowerOfTwo(Integer.MIN_VALUE), "Integer.MIN_VALUE is not a power of two");
    }

}