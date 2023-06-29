package com.devstromo.kyu7.consonants;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsonantsUnitTest {
    @Test
    public void testCase1() {
        assertEquals(0, Consonants.getCount(""), "Test string is empty string");
        assertEquals(0, Consonants.getCount("aaaaa"), "Test string: \"aaaaa\"");
        assertEquals(2, Consonants.getCount("XaeiouX"), "Test string: \"XaeiouX\"");
        assertEquals(5, Consonants.getCount("Bbbbb"), "Test string: \"Bbbbb\"");
        assertEquals(7, Consonants.getCount("helLo world"), "Test string: \"helLo world\"");
        assertEquals(7, Consonants.getCount("h^$&^#$&^elLo world"), "Test string: \"h^$&^#$&^elLo world\"");
        assertEquals(2, Consonants.getCount("012345_Cb"), "Test string: \"012345_Cb\"");
        assertEquals(0, Consonants.getCount("0123456789"), "Test string: \"0123456789\"");
    }
}