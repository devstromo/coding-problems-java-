package com.devstromo.day381;

import static com.devstromo.day381.Problem.hexToBase64;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemUnitTest {
    @Test
    void testHexToBase64() {
        String hex = "deadbeef";
        String expectedBase64 = "3q2+7w==";
        assertEquals(expectedBase64, hexToBase64(hex), "The hex string should be correctly converted to base64");
    }
}