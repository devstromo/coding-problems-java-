package com.devstromo.medium.p139

class SolutionKt {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val wordSet: Set<String> = HashSet(wordDict)
        val n = s.length
        val dp = BooleanArray(n + 1)
        dp[0] = true

        for (i in 1..n) {
            for (j in 0..<i) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true
                    break
                }
            }
        }

        return dp[n]
    }

    fun wordBreakBest(s: String, wordDict: List<String>): Boolean {
        class Node {
            val next = Array<Node?>(26) {null}
            var isEnd = false
        }
        val root = Node()
        fun insert(str: String) {
            var cur = root
            for (c in str) {
                val idx = c.code - 'a'.code
                cur = cur.next[idx] ?: Node().apply { cur.next[idx] = this }
            }
            cur.isEnd = true
        }

        fun dpSearch(str: String): Boolean {
            val dp = BooleanArray(str.length+1) {false}
            dp[0] = true
            for (i in str.indices) {
                if (!dp[i]) continue
                var cur = root
                for (j in i until str.length) {
                    val idx = str[j].code - 'a'.code

                    cur = cur.next[idx] ?: break

                    if (cur.isEnd)
                        dp[j+1] = true
                }
                //if (dp[str.length]) return true
            }
            return dp[str.length]
        }

        for (word in wordDict)
            if (!dpSearch(word)) insert(word)

        return dpSearch(s)
    }
}