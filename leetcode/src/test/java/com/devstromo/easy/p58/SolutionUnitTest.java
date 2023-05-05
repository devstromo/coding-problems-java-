package com.devstromo.easy.p58;

import static com.devstromo.easy.p58.Solution.lengthOfLastWord;
import static com.devstromo.easy.p58.Solution.lengthOfLastWordNotBuildIn;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testLengthOfLastWord() {
        var input = "Hello World";
        assertEquals(5, lengthOfLastWord(input));
        input = "   fly me   to   the moon  ";
        assertEquals(4, lengthOfLastWord(input));
        input = "luffy is still joyboy";
        assertEquals(6, lengthOfLastWord(input));
    }

    @Test
    void testLengthOfLastWordNotBuildIn() {
        var input = "Hello World";
        assertEquals(5, lengthOfLastWordNotBuildIn(input));
        input = "   fly me   to   the moon  ";
        assertEquals(4, lengthOfLastWordNotBuildIn(input));
        input = "luffy is still joyboy";
        assertEquals(6, lengthOfLastWordNotBuildIn(input));
    }
}