package com.devstromo.medium.p92;

public class Solution {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null)
            return head;
        ListNode current = head, prev = null;
        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        var lastNodeBeforeReverse = prev;
        var tail = current;
        while (right > 0) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }
        if (lastNodeBeforeReverse != null)
            lastNodeBeforeReverse.next = prev;
        else
            head = prev;
        tail.next = current;
        return head;
    }
}
