package com.devstromo.dynamic_programming.abbreviation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultUnitTest {

    @Test
    void testAbbreviation() {
        assertEquals("YES", Result.abbreviation("daBcd",  "ABC"));
        assertEquals("NO", Result.abbreviation("AbcDE",  "AFDE"));
        assertEquals("YES", Result.abbreviation("AbcDE",  "ABDE"));
    }

}