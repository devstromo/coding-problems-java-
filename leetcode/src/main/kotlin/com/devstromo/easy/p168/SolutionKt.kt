package com.devstromo.easy.p168

class SolutionKt {
    fun convertToTitle(columnNumber: Int): String {
        val result = StringBuilder()
        var numberOfColumns = columnNumber
        while (numberOfColumns > 0) {
            numberOfColumns--
            result.append(('A'.code + (numberOfColumns % 26)).toChar())
            numberOfColumns /= 26
        }
        return result.reverse().toString()
    }
}