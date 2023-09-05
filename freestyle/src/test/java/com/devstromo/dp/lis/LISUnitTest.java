package com.devstromo.dp.lis;

import static com.devstromo.dp.lis.LIS.lis;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LISUnitTest {

    @Test
    public void testLis() {
        var arr1 = new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        assertEquals(6, lis(arr1));
    }

    @Test
    public void testLis2() {
        var arr2 = new int[] { 3, 4, 5, 10, 2, 15 };
        assertEquals(5, lis(arr2));
    }

    @Test
    public void testLis3() {
        var arr3 = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        assertEquals(1, lis(arr3));
    }

}