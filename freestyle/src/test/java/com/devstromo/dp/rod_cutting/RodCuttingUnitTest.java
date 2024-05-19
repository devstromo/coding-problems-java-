package com.devstromo.dp.rod_cutting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodCuttingUnitTest {
    private final RodCutting rodCutting = new RodCutting();

    @Test
    public void testRodCuttingRecursive() {
        assertEquals(10, rodCutting.recursive(4, new long[]{1, 5, 8, 9}));
        assertEquals(22, rodCutting.recursive(8, new long[]{1, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(24, rodCutting.recursive(8, new long[]{3, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(23, rodCutting.recursive(8, new long[]{2, 5, 9, 10, 12, 13, 15, 16}));
        assertEquals(20, rodCutting.recursive(7, new long[]{2, 5, 9, 10, 12, 13, 15}));
    }

    @Test
    public void testRodCuttingMemoized() {
        assertEquals(10, rodCutting.memoized(4, new long[]{1, 5, 8, 9}));
        assertEquals(22, rodCutting.memoized(8, new long[]{1, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(24, rodCutting.memoized(8, new long[]{3, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(23, rodCutting.memoized(8, new long[]{2, 5, 9, 10, 12, 13, 15, 16}));
        assertEquals(20, rodCutting.memoized(7, new long[]{2, 5, 9, 10, 12, 13, 15}));
    }

    @Test
    public void testRodCuttingTabular() {
        assertEquals(10, rodCutting.tabular(4, new long[]{1, 5, 8, 9}));
        assertEquals(22, rodCutting.tabular(8, new long[]{1, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(24, rodCutting.tabular(8, new long[]{3, 5, 8, 9, 10, 17, 17, 20}));
        assertEquals(23, rodCutting.tabular(8, new long[]{2, 5, 9, 10, 12, 13, 15, 16}));
        assertEquals(20, rodCutting.tabular(7, new long[]{2, 5, 9, 10, 12, 13, 15}));
    }
}