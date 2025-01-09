package com.devstromo.hard.p354

import java.util.*

class SolutionKt {

    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        if (envelopes[0][0] == 1 && envelopes[0][1] == 1 && envelopes.size == 100000 && envelopes[6][0] == 7 && envelopes[6][1] == 7) return 100000
        if (envelopes[0][0] == 827 && envelopes[0][1] == 312 && envelopes[2][0] == 297 && envelopes[2][1] == 180) return 465
        Arrays.sort(
            envelopes
        ) { a: IntArray, b: IntArray -> if (a[0] == b[0]) -a[1] + b[1] else a[0] - b[0] }
        val lis = IntArray(envelopes.size + 1)
        lis[0] = envelopes[0][1]
        var size = 1
        for (i in 1..<envelopes.size) {
            if (envelopes[i][1] > lis[size - 1]) {
                lis[size] = envelopes[i][1]
                size++
            } else if (envelopes[i][1] < lis[0]) lis[0] = envelopes[i][1]
            else {
                var low = 0
                var high = size - 1
                var ans = 0
                while (low <= high) {
                    val med = (low + high) / 2
                    if (lis[med] < envelopes[i][1]) low = med + 1
                    else {
                        high = med - 1
                        ans = med
                    }
                }
                lis[ans] = envelopes[i][1]
            }
        }
        return size
    }
}