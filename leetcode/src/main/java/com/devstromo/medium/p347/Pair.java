package com.devstromo.medium.p347;

public record Pair<T, T1>(T key, T1 value) {

    public static <T, T1> Pair<T, T1> of(T key, T1 value) {
        return new Pair<>(key, value);
    }
}
