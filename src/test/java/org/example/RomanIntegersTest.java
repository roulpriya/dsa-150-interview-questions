package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanIntegersTest {


    RomanIntegers romanIntegers = new RomanIntegers();

    @Test
    void testRomanIntegers(){
        assertEquals(621, romanIntegers.romanToInt("DCXXI"));
    }

}