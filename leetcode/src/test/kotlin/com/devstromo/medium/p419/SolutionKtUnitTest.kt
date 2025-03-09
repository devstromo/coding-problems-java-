package com.devstromo.medium.p419

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    fun `Test Battleships in a Board`() {
        assertEquals(
            2, solution.countBattleships(
                arrayOf(
                    charArrayOf('X', '.', '.', 'X'),
                    charArrayOf('.', '.', '.', 'X'),
                    charArrayOf('.', '.', '.', 'X')
                )
            )
        )

        assertEquals(
            0, solution.countBattleships(
                arrayOf(
                    charArrayOf('.')
                )
            )
        )
    }

    @Test
    fun `Test Battleships in a Board Best`() {
        assertEquals(
            2, solution.countBattleshipsBest(
                arrayOf(
                    charArrayOf('X', '.', '.', 'X'),
                    charArrayOf('.', '.', '.', 'X'),
                    charArrayOf('.', '.', '.', 'X')
                )
            )
        )

        assertEquals(
            0, solution.countBattleshipsBest(
                arrayOf(
                    charArrayOf('.')
                )
            )
        )
    }
}