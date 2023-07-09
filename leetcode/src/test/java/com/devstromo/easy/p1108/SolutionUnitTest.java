package com.devstromo.easy.p1108;

import static com.devstromo.easy.p1108.Solution.defangIPaddr;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testDefangIPaddr() {
        assertEquals("1[.]1[.]1[.]1", defangIPaddr("1.1.1.1"));
    }

    @Test
    void testDefangIPaddr1() {
        assertEquals("255[.]100[.]50[.]0", defangIPaddr("255.100.50.0"));
    }
}