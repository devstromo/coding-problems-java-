package com.devstromo.easy.p206;

class Solution {
    public static ListNode reverseList(ListNode head) {
        var current = head;
        ListNode prev = null;
        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
