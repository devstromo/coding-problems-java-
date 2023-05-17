package com.devstromo.medium.p2130;

import java.util.ArrayList;
import java.util.List;

class Solution {

    static ListNode l;
    static int max = 0;

    public static int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < values.size(); i++) {
            max = Math.max(max, values.get(i) + values.get(values.size() - i - 1));
        }
        return max;
    }

    public static int pairSumTwoPointers(ListNode head) {
        ListNode slow = head, fast = head, prev = null, curr = head, temp = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        int max = Integer.MIN_VALUE;
        while (prev != null && curr != null) {
            max = Math.max(max, (prev.val + curr.val));
            prev = prev.next;
            curr = curr.next;
        }
        System.gc();
        return max;
    }

    public static int pairSumRecursive(ListNode head) {
        l = head;
        helper(head);
        return max;
    }

    private static int helper(ListNode node) {
        if (node.next == null)
            return node.val;
        var r = helper(node.next);
        if (r == -1)
            return r;
        max = Math.max(max, l.val + r);
        l = l.next;
        return l == node ? -1 : node.val;
    }

}
