package com.devstromo.easy.p67

class SolutionKt {
    fun addBinary(a: String, b: String): String {
        val numberA = a.toBigInteger(2)
        val numberB = b.toBigInteger(2)
        return numberB.add(numberA).toString(2)
    }

    fun addBinaryIterate(a: String, b: String): String {
        var carry = 0
        var p1 = a.length - 1
        var p2 = b.length - 1
        val result = StringBuilder()
        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            val bit1: Int = if (p1 >= 0) a[p1] - '0' else 0
            val bit2: Int = if (p2 >= 0) b[p2] - '0' else 0
            val sum = bit1 + bit2 + carry
            result.append(sum % 2)
            carry = sum / 2
            p1--
            p2--
        }
        return result.reverse().toString()
    }
}