package com.devstromo.medium.p419

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class SolutionKtUnitTest {
    private val solution = SolutionKt()

    @Test
    @DisplayName("Test Battleships in a Board")
    fun testBattleshipsInBoard() {
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
}