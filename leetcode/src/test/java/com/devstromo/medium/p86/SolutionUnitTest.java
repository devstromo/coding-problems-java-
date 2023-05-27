package com.devstromo.medium.p86;

import static com.devstromo.medium.p86.Solution.partition;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    void testPartitions() {
        var head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        var expected = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5))))));
        var cursorResult = partition(head, 3);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }
}