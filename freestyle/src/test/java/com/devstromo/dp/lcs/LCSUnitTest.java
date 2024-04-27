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
    }

}