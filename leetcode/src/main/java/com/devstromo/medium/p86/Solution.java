package com.devstromo.medium.p86;

class Solution {
    public static ListNode partition(ListNode head, int x) {
        ListNode headLow = new ListNode();
        ListNode headHigh = new ListNode();
        ListNode low = headLow;
        ListNode high = headHigh;
        while (head != null) {
            if (head.val < x) {
                low.next = head;
                low = low.next;
            } else {
                high.next = head;
                high = high.next;
            }
            head = head.next;
        }
        low.next = headHigh.next;
        high.next = null;
        return headLow.next;
    }
}
