package com.devstromo.medium.p1721;

class Solution {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        int count = 1;
        while (count < k) {
            left = left.next;
            count++;
        }
        ListNode current = left;
        while (current.next != null) {
            right = right.next;
            current = current.next;
        }
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
        return head;
    }
}
