package com.devstromo.easy.p206;

import static com.devstromo.easy.p206.Solution.reverseList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testReverseList() {
        var head = new ListNode(4, new ListNode(7, new ListNode(3, new ListNode(9, new ListNode(8, new ListNode(2, new ListNode(5, null)))))));
        var expected = new ListNode(5, new ListNode(2, new ListNode(8, new ListNode(9, new ListNode(3, new ListNode(7, new ListNode(4, null)))))));
        var cursorResult = reverseList(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

}