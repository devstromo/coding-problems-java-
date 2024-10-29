package com.devstromo.medium.p24

class SolutionKt {
    fun swapPairs(head: ListNode?): ListNode? {
        val newHead = ListNode(-1)
        var prev = newHead
        var current = head
        newHead.next = head
        while (current?.next != null) {
            prev.next = current.next
            current.next = current.next.next
            prev.next.next = current
            current = current.next
            prev = prev.next.next
        }
        return newHead.next
    }
}