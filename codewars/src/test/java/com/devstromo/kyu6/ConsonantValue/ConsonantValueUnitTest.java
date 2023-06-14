package com.devstromo.kyu6.ConsonantValue;

import static com.devstromo.kyu6.ConsonantValue.ConsonantValue.solve;
import static com.devstromo.kyu6.ConsonantValue.ConsonantValue.solve2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsonantValueUnitTest {
    @Test
    public void basicTests() {
        assertEquals(26, solve("zodiac"));
        assertEquals(80, solve("chruschtschov"));
        assertEquals(38, solve("khrushchev"));
        assertEquals(57, solve("strength"));
        assertEquals(73, solve("catchphrase"));
        assertEquals(103, solve("twelfthstreet"));
        assertEquals(80, solve("mischtschenkoana"));
    }

    @Test
    public void basicTests2() {
        assertEquals(26, solve2("zodiac"));
        assertEquals(80, solve2("chruschtschov"));
        assertEquals(38, solve2("khrushchev"));
        assertEquals(57, solve2("strength"));
        assertEquals(73, solve2("catchphrase"));
        assertEquals(103, solve2("twelfthstreet"));
        assertEquals(80, solve2("mischtschenkoana"));
    }
}