package com.devstromo.easy.p557;

import static com.devstromo.easy.p557.Solution.reverseWords;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testReverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
    }

    @Test
    void testReverseWords2() {
        assertEquals("doG gniD", reverseWords("God Ding"));
    }

}