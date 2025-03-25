package com.devstromo.medium.p46

class SolutionKt {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        backtrack(nums, mutableListOf(), BooleanArray(nums.size), result)
        return result
    }

    private fun backtrack(
        nums: IntArray,
        current: MutableList<Int>,
        used: BooleanArray,
        result: MutableList<List<Int>>
    ) {
        if (current.size == nums.size) {
            result.add(ArrayList(current))
            return
        }

        for (i in nums.indices) {
            if (used[i]) continue

            used[i] = true
            current.add(nums[i])

            backtrack(nums, current, used, result)

            used[i] = false
            current.removeAt(current.size - 1)
        }
    }
}