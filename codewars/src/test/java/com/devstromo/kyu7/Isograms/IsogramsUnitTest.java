package com.devstromo.kyu7.Isograms;

import static com.devstromo.kyu7.Isograms.Isograms.isIsogram;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsogramsUnitTest {
    @Test
    public void FixedTests() {
        assertTrue(isIsogram("Dermatoglyphics"));
        assertTrue(isIsogram("isogram"));
        assertFalse(isIsogram("moose"));
        assertFalse(isIsogram("isIsogram"));
        assertFalse(isIsogram("aba"));
        assertFalse(isIsogram("moOse"));
        assertTrue(isIsogram("thumbscrewjapingly"));
        assertTrue(isIsogram(""));
    }
}