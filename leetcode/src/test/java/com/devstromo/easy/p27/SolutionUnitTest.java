package com.devstromo.easy.p27;

import org.junit.jupiter.api.Test;

import static com.devstromo.easy.p27.Solution.removeElement;
import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {

    @Test
    public void testRemoveElement() {
        assertEquals(5, removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    @Test
    public void testRemoveElement2() {
        assertEquals(2, removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    @Test
    public void testRemoveElement3() {
        assertEquals(0, removeElement(new int[]{2, 2, 2, 2}, 2));
    }

    @Test
    public void testRemoveElement4() {
        assertEquals(0, removeElement(new int[]{2}, 2));
    }
}