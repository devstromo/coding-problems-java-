package com.devstromo.medium.p307;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayUnitTest {

    @Test
    public void testNumArrayMutable() {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});
        assertEquals(9, numArray.sumRange(0, 2));
        numArray.update(1, 2);
        assertEquals(8, numArray.sumRange(0, 2));
    }

    @Test
    public void testNumArrayMutable2() {
        NumArray numArray = new NumArray(new int[]{-1});
        assertEquals(-1, numArray.sumRange(0, 0));
        numArray.update(0, 1);
        assertEquals(1, numArray.sumRange(0, 0));
    }

}