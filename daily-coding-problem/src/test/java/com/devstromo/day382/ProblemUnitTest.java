package com.devstromo.day382;

import static com.devstromo.day382.Problem.base64ToHex;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProblemUnitTest {
    @Test
    void testBase64ToHex() {
        String base64 = "3q2+7w==";
        String expectedHex = "deadbeef";
        assertEquals(expectedHex, base64ToHex(base64), "The base64 string should be correctly converted to hex");
    }
}