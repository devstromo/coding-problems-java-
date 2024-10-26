package com.devstromo.easy.p206

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test reverseList with multiple elements`() {
        val head = ListNodeKt(1).apply {
            next = ListNodeKt(2).apply {
                next = ListNodeKt(3).apply {
                    next = ListNodeKt(4).apply {
                        next = ListNodeKt(5)
                    }
                }
            }
        }

        val reversedHead = solution.reverseList(head)

        val expectedValues = listOf(5, 4, 3, 2, 1)
        var current = reversedHead
        for (value in expectedValues) {
            assertEquals(value, current?.`val`)
            current = current?.next
        }
    }

    @Test
    fun `Test reverseList with single element`() {
        val head = ListNodeKt(1)

        val reversedHead = solution.reverseList(head)

        assertEquals(1, reversedHead?.`val`)
        assertEquals(null, reversedHead?.next)
    }

    @Test
    fun `Test reverseList with empty list`() {
        val head: ListNodeKt? = null

        val reversedHead = solution.reverseList(head)

        assertEquals(null, reversedHead)
    }
}