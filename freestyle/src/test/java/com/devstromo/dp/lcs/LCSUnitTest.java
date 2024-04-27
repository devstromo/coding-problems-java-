package com.devstromo.dp.lcs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCSUnitTest {
    private final LCS lcs = new LCS();

    @Test
    void testLCS() {
        var sequence1 = "ABCBDAB";
        var sequence2 = "BDCABC";
        assertEquals(4, lcs.lcs(sequence1, sequence2));
        sequence1 = "XMJYAUZ";
        sequence2 = "MZJAWXU";
        assertEquals(4, lcs.lcs(sequence1, sequence2));
    }

    @Test
    void testLCSBlankString() {
        var sequence1 = "ABCBDAB";
        var sequence2 = "";
        assertEquals(0, lcs.lcs(sequence1, sequence2));
    }

    @Test
    void testLCSBothBlankString() {
        var sequence1 = "";
        var sequence2 = "";
        assertEquals(0, lcs.lcs(sequence1, sequence2));
    }

    @Test
    void testLCSString() {
        var sequence1 = "ABCBDAB";
        var sequence2 = "BDCABC";
        assertEquals("BCAB", lcs.lcsString(sequence1, sequence2));
        sequence1 = "XMJYAUZ";
        sequence2 = "MZJAWXU";
        assertEquals("MJAU", lcs.lcsString(sequence1, sequence2));
    }

    @Test
    void testLCSStringBlankString() {
        var sequence1 = "ABCBDAB";
        var sequence2 = "";
        assertEquals("", lcs.lcsString(sequence1, sequence2));
    }

    @Test
    void testLCSStringBothBlankString() {
        var sequence1 = "";
        var sequence2 = "";
        assertEquals("", lcs.lcsString(sequence1, sequence2));
    }

}