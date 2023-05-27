package com.devstromo.kyu4.Hamming;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HammingUnitTest {
    @Test
    public void Test1() {
        assertEquals(1, Hamming.hamming(1), "hamming(1) should be 1");
        assertEquals(2, Hamming.hamming(2), "hamming(2) should be 2");
        assertEquals(3, Hamming.hamming(3), "hamming(3) should be 3");
        assertEquals(4, Hamming.hamming(4), "hamming(4) should be 4");
        assertEquals(5, Hamming.hamming(5), "hamming(5) should be 5");
        assertEquals(6, Hamming.hamming(6), "hamming(6) should be 6");
        assertEquals(8, Hamming.hamming(7), "hamming(7) should be 8");
        assertEquals(9, Hamming.hamming(8), "hamming(8) should be 9");
        assertEquals(10, Hamming.hamming(9), "hamming(9) should be 10");
        assertEquals(12, Hamming.hamming(10), "hamming(10) should be 12");
        assertEquals(15, Hamming.hamming(11), "hamming(11) should be 15");
        assertEquals(16, Hamming.hamming(12), "hamming(12) should be 16");
        assertEquals(18, Hamming.hamming(13), "hamming(13) should be 18");
        assertEquals(20, Hamming.hamming(14), "hamming(14) should be 20");
        assertEquals(24, Hamming.hamming(15), "hamming(15) should be 24");
        assertEquals(25, Hamming.hamming(16), "hamming(16) should be 25");
        assertEquals(27, Hamming.hamming(17), "hamming(17) should be 27");
        assertEquals(30, Hamming.hamming(18), "hamming(18) should be 30");
        assertEquals(32, Hamming.hamming(19), "hamming(19) should be 32");
    }

    @Test
    public void TestBest() {
        assertEquals(1, Hamming.hammingBest(1), "hamming(1) should be 1");
        assertEquals(2, Hamming.hammingBest(2), "hamming(2) should be 2");
        assertEquals(3, Hamming.hammingBest(3), "hamming(3) should be 3");
        assertEquals(4, Hamming.hammingBest(4), "hamming(4) should be 4");
        assertEquals(5, Hamming.hammingBest(5), "hamming(5) should be 5");
        assertEquals(6, Hamming.hammingBest(6), "hamming(6) should be 6");
        assertEquals(8, Hamming.hammingBest(7), "hamming(7) should be 8");
        assertEquals(9, Hamming.hammingBest(8), "hamming(8) should be 9");
        assertEquals(10, Hamming.hammingBest(9), "hamming(9) should be 10");
        assertEquals(12, Hamming.hammingBest(10), "hamming(10) should be 12");
        assertEquals(15, Hamming.hammingBest(11), "hamming(11) should be 15");
        assertEquals(16, Hamming.hammingBest(12), "hamming(12) should be 16");
        assertEquals(18, Hamming.hammingBest(13), "hamming(13) should be 18");
        assertEquals(20, Hamming.hammingBest(14), "hamming(14) should be 20");
        assertEquals(24, Hamming.hammingBest(15), "hamming(15) should be 24");
        assertEquals(25, Hamming.hammingBest(16), "hamming(16) should be 25");
        assertEquals(27, Hamming.hammingBest(17), "hamming(17) should be 27");
        assertEquals(30, Hamming.hammingBest(18), "hamming(18) should be 30");
        assertEquals(32, Hamming.hammingBest(19), "hamming(19) should be 32");
    }
}