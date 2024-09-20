package com.devstromo.dynamic_programming.equal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultUnitTest {

    @Test
    void testEqualsResult() {
        assertEquals(2, Result.equal(List.of(1, 1, 5)));
        assertEquals(2, Result.equal(List.of(2, 2, 3, 7)));
        assertEquals(3, Result.equal(List.of(10, 7, 12)));
    }

}