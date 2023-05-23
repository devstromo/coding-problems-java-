package com.devstromo.easy.p703;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestUnitTest {

    @Test
    void testKthLargest() {
        KthLargest kthLargest = new KthLargest(3, new int[] { 4, 5, 8, 2 });
        assertEquals(4, kthLargest.add(3));
        assertEquals(5, kthLargest.add(5));
        assertEquals(5, kthLargest.add(10));
        assertEquals(8, kthLargest.add(9));
        assertEquals(8, kthLargest.add(4));
    }

}