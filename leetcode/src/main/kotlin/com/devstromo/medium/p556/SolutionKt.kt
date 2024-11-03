package com.devstromo.medium.p556

class SolutionKt {
    fun nextGreaterElement(n: Int): Int {
        val digits = n.toString().toCharArray()
        var i = digits.size - 2
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--
        }
        if (i < 0) {
            return -1
        }
        var j = digits.size - 1
        while (digits[j] <= digits[i]) {
            j--
        }
        swap(digits, i, j)
        reverse(digits, i + 1, digits.size - 1)
        return try {
            String(digits).toInt()
        } catch (e: NumberFormatException) {
            -1
        }
    }

    private fun swap(arr: CharArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

    private fun reverse(arr: CharArray, start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            swap(arr, left, right)
            left++
            right--
        }
    }
}