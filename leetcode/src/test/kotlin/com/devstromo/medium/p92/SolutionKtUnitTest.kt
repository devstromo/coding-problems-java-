package com.devstromo.medium.p92

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    private fun buildList(values: List<Int>): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (value in values.drop(1)) {
            current.next = ListNode(value)
            current = current.next!!
        }
        return head
    }

    private fun listToArray(head: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var current = head
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result
    }

    @Test
    fun `Test reverseBetween with full reversal`() {
        val head = buildList(listOf(1, 2, 3, 4, 5))
        val result = solution.reverseBetween(head, 1, 5)
        val expected = listOf(5, 4, 3, 2, 1)
        assertEquals(expected, listToArray(result))
    }

    @Test
    fun `Test reverseBetween with partial reversal`() {
        val head = buildList(listOf(1, 2, 3, 4, 5))
        val result = solution.reverseBetween(head, 2, 4)
        val expected = listOf(1, 4, 3, 2, 5)
        assertEquals(expected, listToArray(result))
    }

    @Test
    fun `Test reverseBetween with single element reversal`() {
        val head = buildList(listOf(1, 2, 3, 4, 5))
        val result = solution.reverseBetween(head, 3, 3)
        val expected = listOf(1, 2, 3, 4, 5)  // No change expected
        assertEquals(expected, listToArray(result))
    }

    @Test
    fun `Test reverseBetween with reversal at start`() {
        val head = buildList(listOf(1, 2, 3, 4, 5))
        val result = solution.reverseBetween(head, 1, 3)
        val expected = listOf(3, 2, 1, 4, 5)
        assertEquals(expected, listToArray(result))
    }

    @Test
    fun `Test reverseBetween with reversal at end`() {
        val head = buildList(listOf(1, 2, 3, 4, 5))
        val result = solution.reverseBetween(head, 3, 5)
        val expected = listOf(1, 2, 5, 4, 3)
        assertEquals(expected, listToArray(result))
    }
}