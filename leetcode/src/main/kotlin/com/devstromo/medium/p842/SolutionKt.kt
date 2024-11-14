package com.devstromo.medium.p842

class SolutionKt {
    fun splitIntoFibonacci(num: String): List<Int> {
        val result: MutableList<Int> = ArrayList()
        backtrack(num, result, 0)
        return result
    }

    private fun backtrack(s: String, res: MutableList<Int>, pos: Int): Boolean {
        if (pos == s.length) {
            return res.size > 2
        }
        var num: Long = 0
        for (i in pos until s.length) {
            num = num * 10 + (s[i].code - '0'.code)
            if (num > Int.MAX_VALUE) {
                return false
            }
            if (res.size < 2 || (res[res.size - 1] + res[res.size - 2]).toLong() == num) {
                res.add(num.toInt())
                if (backtrack(s, res, i + 1)) {
                    return true
                }
                res.removeLast()
            }
            if (i == pos && s[pos] == '0') {
                return false
            }
        }
        return false
    }
}