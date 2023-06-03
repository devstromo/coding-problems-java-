package com.devstromo.easy.p119;

import static com.devstromo.easy.p119.Solution.getRow;
import static com.devstromo.easy.p119.Solution.getRowMemory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCaseGetRow() {
        assertEquals(List.of(1), getRow(0));
    }

    @Test
    void testCaseGetRow2() {
        assertEquals(List.of(1,3,3,1), getRow(3));
    }

    @Test
    void testCaseGetRow3() {
        assertEquals(List.of(1,1), getRow(1));
    }

    @Test
    void testCaseGetRowBestMemory() {
        assertEquals(List.of(1), getRowMemory(0));
    }

    @Test
    void testCaseGetRowBestMemory2() {
        assertEquals(List.of(1,3,3,1), getRowMemory(3));
    }

    @Test
    void testCaseGetRowBestMemory3() {
        assertEquals(List.of(1,1), getRowMemory(1));
    }

}