package com.devstromo.easy.p141

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class SolutionKt {
    fun hasCycle(head: ListNode?): Boolean {
        var slow: ListNode? = head
        var fast: ListNode? = head

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next
            fast = fast.next!!.next

            if (slow == fast) {
                return true
            }
        }
        return false
    }
}