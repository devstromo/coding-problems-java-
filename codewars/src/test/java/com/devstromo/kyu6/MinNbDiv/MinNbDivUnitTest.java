package com.devstromo.kyu6.MinNbDiv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinNbDivUnitTest {

    @Test
    public void test() {
        assertEquals(48, MinNbDiv.findMinNumTLE(10));
        assertEquals(60, MinNbDiv.findMinNumTLE(12));
        assertEquals(1, MinNbDiv.findMinNumTLE(1));
        assertEquals(64, MinNbDiv.findMinNumTLE(7));
        assertEquals(24, MinNbDiv.findMinNumTLE(8));
        assertEquals(36, MinNbDiv.findMinNumTLE(9));
        assertEquals(12, MinNbDiv.findMinNumTLE(6));
    }

    @Test
    public void testSolution() {
        assertEquals(48, MinNbDiv.findMinNumSolution(10));
        assertEquals(60, MinNbDiv.findMinNumSolution(12));
        assertEquals(1, MinNbDiv.findMinNumSolution(1));
        assertEquals(64, MinNbDiv.findMinNumSolution(7));
        assertEquals(24, MinNbDiv.findMinNumSolution(8));
        assertEquals(36, MinNbDiv.findMinNumSolution(9));
        assertEquals(12, MinNbDiv.findMinNumSolution(6));
    }

    @Test
    public void testMinNbDiv() {
        assertEquals(48, MinNbDiv.findMinNum(10));
        assertEquals(60, MinNbDiv.findMinNum(12));
        assertEquals(1, MinNbDiv.findMinNum(1));
        assertEquals(64, MinNbDiv.findMinNum(7));
        assertEquals(24, MinNbDiv.findMinNum(8));
        assertEquals(36, MinNbDiv.findMinNum(9));
        assertEquals(12, MinNbDiv.findMinNum(6));
    }

    @Test
    public void testMinNbDiv2() {
        assertEquals(48, MinNbDiv.findMinNumTest(10));
        assertEquals(60, MinNbDiv.findMinNumTest(12));
        assertEquals(1, MinNbDiv.findMinNumTest(1));
        assertEquals(64, MinNbDiv.findMinNumTest(7));
        assertEquals(24, MinNbDiv.findMinNumTest(8));
        assertEquals(36, MinNbDiv.findMinNumTest(9));
        assertEquals(12, MinNbDiv.findMinNumTest(6));
    }
}