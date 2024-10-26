package com.devstromo.easy.p206

class SolutionKt {
    fun reverseList(head: ListNodeKt?): ListNodeKt? {
        var current = head
        var prev: ListNodeKt? = null
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}

class ListNodeKt(var `val`: Int) {
    var next: ListNodeKt? = null
}