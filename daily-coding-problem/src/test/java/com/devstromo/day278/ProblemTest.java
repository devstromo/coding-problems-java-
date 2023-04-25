package com.devstromo.day278;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemTest {

    @Test
    public void binarySearchTreeGenerator() {
        Problem binarySearchTreeGenerator = new Problem();
        var result = binarySearchTreeGenerator.solve(3);
        assertEquals(5, result.size());
    }

}