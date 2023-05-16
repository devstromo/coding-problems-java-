package com.devstromo.medium.p24;

class Solution {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        do {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            if (first.next != null)
                first = first.next.next;
            if (second.next != null) {
                second = second.next.next;
            } else
                second = null;
        } while (second != null);
        return head;
    }

    public static ListNode swapPairsBestSolution(ListNode head) {
        ListNode dummy = new ListNode(-1), prev = dummy, current = head;
        dummy.next = head;
        while (current != null && current.next != null) {
            prev.next = current.next;
            current.next = current.next.next;
            prev.next.next = current;
            current = current.next;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}
