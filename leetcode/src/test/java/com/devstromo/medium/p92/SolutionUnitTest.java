package com.devstromo.medium.p92;

import static com.devstromo.medium.p92.Solution.reverseBetween;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testReverseBetween() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        var cursorResult = reverseBetween(head, 2, 4);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

}