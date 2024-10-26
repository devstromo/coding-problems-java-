package com.devstromo.medium.p92

class SolutionKt {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null || left == right) return head

        var newHead = head
        var current = head
        var prev: ListNode? = null

        for (i in 1 until left) {
            prev = current
            current = current?.next
        }

        val lastNodeBeforeReverse = prev
        val tail = current

        var next: ListNode?
        for (i in 0..(right - left)) {
            next = current?.next
            current?.next = prev
            prev = current
            current = next
        }

        if (lastNodeBeforeReverse != null) {
            lastNodeBeforeReverse.next = prev
        } else {
            newHead = prev
        }
        tail?.next = current

        return newHead
    }
}