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

    fun letterCombinationsBest(digits: String): List<String> {
        val map = ArrayList<CharArray>()
        map.add(charArrayOf('1'))
        map.add(charArrayOf('1'))

        map.add(charArrayOf('a', 'b', 'c'))
        map.add(charArrayOf('d', 'e', 'f'))
        map.add(charArrayOf('g', 'h', 'i'))
        map.add(charArrayOf('j', 'k', 'l'))
        map.add(charArrayOf('m', 'n', 'o'))
        map.add(charArrayOf('p', 'q', 'r', 's'))
        map.add(charArrayOf('t', 'u', 'v'))
        map.add(charArrayOf('w', 'x', 'y', 'z'))

        val proc = ArrayList<CharArray>()

        for (c in digits) {
            proc.add(map[(c - '0').toInt()])
        }

        val res = ArrayList<String>()

        if (proc.size > 0) recv(res, proc, 0, "")

        return res
    }

    fun recv(res: ArrayList<String>, proc: ArrayList<CharArray>, n: Int, priv: String) {
        for (c in proc[n]) {
            if (n != proc.size - 1) {
                recv(res, proc, n + 1, priv + c)
            } else {
                res.add(priv + c)
            }
        }
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