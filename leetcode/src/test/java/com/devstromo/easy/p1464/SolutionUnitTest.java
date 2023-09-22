package com.devstromo.easy.p1464;

import static com.devstromo.easy.p1464.Solution.maxProduct;
import static com.devstromo.easy.p1464.Solution.maxProductBest;
import static com.devstromo.easy.p1464.Solution.maxProductPQ;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxProduct() {
        assertEquals(12, maxProduct(new int[] { 3, 4, 5, 2 }));
    }

    @Test
    void testMaxProduct2() {
        assertEquals(16, maxProduct(new int[] { 1, 5, 4, 5 }));
    }

    @Test
    void testMaxProduct3() {
        assertEquals(12, maxProduct(new int[] { 3, 7 }));
    }

    @Test
    void testMaxProductPQ() {
        assertEquals(12, maxProductPQ(new int[] { 3, 4, 5, 2 }));
    }

    @Test
    void testMaxProductPQ2() {
        assertEquals(16, maxProductPQ(new int[] { 1, 5, 4, 5 }));
    }

    @Test
    void testMaxProductPQ3() {
        assertEquals(12, maxProductPQ(new int[] { 3, 7 }));
    }

    @Test
    void testMaxProductBest() {
        assertEquals(12, maxProductBest(new int[] { 3, 4, 5, 2 }));
    }

    @Test
    void testMaxProductBest2() {
        assertEquals(16, maxProductBest(new int[] { 1, 5, 4, 5 }));
    }

    @Test
    void testMaxProductBest3() {
        assertEquals(12, maxProductBest(new int[] { 3, 7 }));
    }

}