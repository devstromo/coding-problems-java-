package com.devstromo.easy.p27

class SolutionKt {
    fun removeElementKt(nums: IntArray, `val`: Int): Int {
        var start = 0
        var end: Int = nums.size - 1
        while (start <= end) {
            when (`val`) {
                nums[end] -> {
                    end--
                }

                nums[start] -> {
                    val temp = nums[start]
                    nums[start++] = nums[end]
                    nums[end--] = temp
                }

                else -> {
                    start++
                }
            }
        }
        return end + 1
    }

    fun removeElementBestKt(nums: IntArray, `val`: Int): Int {
        var end = nums.size
        var start = 0
        var pointer = 0
        while (start < nums.size) {
            if (nums[start] != `val`) {
                nums[pointer] = nums[start]
                pointer++
            } else {
                end--
            }
            start++
        }
        return end
    }
}