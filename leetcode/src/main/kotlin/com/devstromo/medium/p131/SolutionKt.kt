package com.devstromo.medium.p131

class SolutionKt {

    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val isPalindrome = precomputePalindromes(s)
        backtrack(s, 0, mutableListOf(), result, isPalindrome)
        return result
    }

    fun partitionBest(s: String): List<List<String>> {
        val len = s.length
        val dp = Array(len) { BooleanArray(len) }
        val result = mutableListOf<List<String>>()
        dfs(result, s, 0, mutableListOf(), dp)
        return result
    }

    private fun backtrack(
        s: String,
        start: Int,
        path: MutableList<String>,
        result: MutableList<List<String>>,
        isPalindrome: Array<BooleanArray>
    ) {
        if (start == s.length) {
            result.add(ArrayList(path))
            return
        }

        for (end in start..<s.length) {
            if (isPalindrome[start][end]) {
                path.add(s.substring(start, end + 1)) // Add the current palindrome substring
                backtrack(s, end + 1, path, result, isPalindrome) // Recur for remaining substring
                path.removeLast() // Backtrack and remove last added substring
            }
        }
    }

    private fun precomputePalindromes(s: String): Array<BooleanArray> {
        val n = s.length
        val isPalindrome = Array(n) { BooleanArray(n) }

        for (right in 0..<n) {
            for (left in 0..right) {
                if (s[left] == s[right] && (right - left <= 2 || isPalindrome[left + 1][right - 1])) {
                    isPalindrome[left][right] = true
                }
            }
        }
        return isPalindrome
    }

    private fun dfs(
        result: MutableList<List<String>>,
        s: String,
        start: Int,
        currentList: MutableList<String>,
        dp: Array<BooleanArray>
    ) {
        if (start >= s.length) {
            result.add(ArrayList(currentList))
            return
        }
        for (end in start until s.length) {
            if (
                s[start] == s[end] &&
                (end - start <= 2 || dp[start + 1][end - 1])
            ) {
                dp[start][end] = true
                currentList.add(s.substring(start, end + 1))
                dfs(result, s, end + 1, currentList, dp)
                currentList.removeAt(currentList.size - 1)
            }
        }
    }
}