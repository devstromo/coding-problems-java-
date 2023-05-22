package com.devstromo.kyu4.StripComments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StripCommentsUnitTest {
    @Test
    public void stripComments() throws Exception {
        assertEquals("apples, pears\ngrapes\nbananas",
          StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));

        assertEquals("a\nc\nd", StripComments.stripComments("a #b\nc\nd $e f g", new String[] { "#", "$" }));

    }

    @Test
    public void stripCommentsBest() throws Exception {
        assertEquals("apples, pears\ngrapes\nbananas",
          StripComments.stripCommentsBest("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));

        assertEquals("a\nc\nd", StripComments.stripCommentsBest("a #b\nc\nd $e f g", new String[] { "#", "$" }));

    }
}