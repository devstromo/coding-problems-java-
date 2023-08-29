package com.devstromo.easy.p2824;

import static com.devstromo.easy.p2824.Solution.countPairs;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountPairs() {
        assertEquals(3, countPairs(List.of(-1, 1, 2, 3, 1), 2));
    }

    @Test
    void testCountPairs2() {
        assertEquals(10, countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));
    }
}