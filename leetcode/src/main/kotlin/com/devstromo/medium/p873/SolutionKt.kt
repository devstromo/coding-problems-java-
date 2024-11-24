package com.devstromo.medium.p873

import kotlin.math.pow

class SolutionKt {
    fun lenLongestFibSubseq(arr: IntArray): Int {
        val index = HashSet<Int>()
        for (n in arr) {
            index.add(n)
        }
        var max = 2
        var i = 0
        while (i < arr.size - max) {
            if (arr[i] * 1.618.pow(max - 1) > arr[arr.size - 1]) break
            var j = i + 1
            while (j < arr.size - max + 1) {
                if (arr[j] * 1.618.pow(max - 2) > arr[arr.size - 1]) break
                var n2 = arr[i]
                var n1 = arr[j]
                var length = 2
                while (index.contains(n1 + n2)) {
                    n1 += n2
                    n2 = n1 - n2
                    length++
                }
                if (length > max) max = length
                j++
            }
            i++
        }

        return if (max < 3) 0 else max
    }
}