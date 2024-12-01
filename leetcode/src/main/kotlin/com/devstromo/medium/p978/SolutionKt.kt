package com.devstromo.medium.p978

class SolutionKt {
    fun maxTurbulenceSize(arr: IntArray): Int {
        var max = 1
        var inc = 1
        var dec = 1
        val n = arr.size
        for (k in 1 until n) {
            if (arr[k] > arr[k - 1]) {
                inc = dec + 1
                dec = 1
            } else if (arr[k] < arr[k - 1]) {
                dec = inc + 1
                inc = 1
            } else {
                inc = 1
                dec = 1
            }
            max = maxOf(max, inc, dec)
        }

        return max
    }
}