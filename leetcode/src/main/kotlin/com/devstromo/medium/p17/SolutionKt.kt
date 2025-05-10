package com.devstromo.medium.p17

class SolutionKt {
    private val phoneMap = mapOf(
        '2' to "abc", '3' to "def",
        '4' to "ghi", '5' to "jkl", '6' to "mno",
        '7' to "pqrs", '8' to "tuv", '9' to "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val result = mutableListOf<String>()
        backtrack(digits, 0, StringBuilder(), result)
        return result
    }

    private fun backtrack(
        digits: String,
        index: Int,
        path: StringBuilder,
        result: MutableList<String>
    ) {
        if (index == digits.length) {
            result.add(path.toString())
            return
        }

        val letters = phoneMap[digits[index]] ?: return
        for (c in letters) {
            path.append(c)
            backtrack(digits, index + 1, path, result)
            path.deleteCharAt(path.lastIndex)
        }
    }
}