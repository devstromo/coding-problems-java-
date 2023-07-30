package com.devstromo.easy.p2194;

import static com.devstromo.easy.p2194.Solution.cellsInRange;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCellsInRange() {
        assertEquals(List.of("K1", "K2", "L1", "L2"), cellsInRange("K1:L2"));
    }

    @Test
    void testCellsInRange2() {
        assertEquals(List.of("A1", "B1", "C1", "D1", "E1", "F1"), cellsInRange("A1:F1"));
    }

}