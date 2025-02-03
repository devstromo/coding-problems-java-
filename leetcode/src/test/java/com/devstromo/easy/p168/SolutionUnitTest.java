package com.devstromo.easy.p168;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Excel Sheet Column Title")
    void testExcelSheetColumnTitle() {
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("B", solution.convertToTitle(2));
        assertEquals("C", solution.convertToTitle(3));
        assertEquals("D", solution.convertToTitle(4));
        assertEquals("AB", solution.convertToTitle(28));
        assertEquals("ZY", solution.convertToTitle(701));
        assertEquals("FXSHRXW", solution.convertToTitle(2147483647));
    }
}