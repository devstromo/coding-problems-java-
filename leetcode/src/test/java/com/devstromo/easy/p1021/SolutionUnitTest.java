package com.devstromo.easy.p1021;

import static com.devstromo.easy.p1021.Solution.removeOuterParentheses;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testRemoveOuterParentheses() {
        assertEquals("()()()", removeOuterParentheses("(()())(())"));
    }

    @Test
    void testRemoveOuterParentheses2() {
        assertEquals("()()()()(())", removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    void testRemoveOuterParentheses3() {
        assertEquals("", removeOuterParentheses("()()"));
    }

}