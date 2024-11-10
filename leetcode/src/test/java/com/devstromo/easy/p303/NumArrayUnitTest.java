package com.devstromo.easy.p303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayUnitTest {
    @Test
    void testNumArray() {
        final var numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }

}