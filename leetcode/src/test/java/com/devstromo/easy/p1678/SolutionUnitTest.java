package com.devstromo.easy.p1678;

import static com.devstromo.easy.p1678.Solution.interpret;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testInterpret() {
        assertEquals("Goal", interpret("G()(al)"));
    }

    @Test
    void testInterpret2() {
        assertEquals("Gooooal", interpret("G()()()()(al)"));
    }

    @Test
    void testInterpret3() {
        assertEquals("alGalooG", interpret("(al)G(al)()()G"));
    }
}