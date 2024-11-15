package com.devstromo.medium.p307

class NumArrayKt(nums: IntArray) {
    private var len = 0
    private val n: IntArray
    private val tree: IntArray

    init {
        len = nums.size
        n = IntArray(len)
        tree = IntArray(len + 1)
        for (i in 0 until len) {
            update(i, nums[i])
        }
    }

    fun update(index: Int, `val`: Int) {
        val diff = `val` - n[index]
        n[index] = `val`

        var i = index + 1
        while (i <= len) {
            tree[i] += diff
            i += lowbit(i)
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return preSum(right + 1) - preSum(left)
    }

    private fun preSum(index: Int): Int {
        var s = 0

        var i = index
        while (i > 0) {
            s += tree[i]
            i -= lowbit(i)
        }

        return s
    }

    private fun lowbit(i: Int): Int {
        return i and -i
    }
}