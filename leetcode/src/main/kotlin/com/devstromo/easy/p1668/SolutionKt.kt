package com.devstromo.easy.p1668

fun maxRepeating(sequence: String, word: String): Int {
    var count = 0
    while (sequence.contains(word.repeat(count))) {
        count++
    }
    return count - 1
}