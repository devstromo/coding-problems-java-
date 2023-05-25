package com.devstromo.medium.p837;

import static com.devstromo.medium.p837.Solution.new21Game;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testNew21Game() {
        assertEquals(1.00000, new21Game(10, 1, 10), 0.00001);
    }

    @Test
    void testNew21Game2() {
        assertEquals(0.60000, new21Game(6, 1, 10), 0.00001);
    }

    @Test
    void testNew21Game3() {
        assertEquals(.73278, new21Game(21, 17, 10), 0.00001);
    }

    @Test
    void testNew21Game4() {
        assertEquals(1.00000, new21Game(12, 1, 10), 0.00001);
    }

}