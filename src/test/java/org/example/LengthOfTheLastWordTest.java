package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfTheLastWordTest {

    @Test
    public void testLengthOfLastWord(){
        LengthOfTheLastWord length = new LengthOfTheLastWord();

        assertEquals(5, length.lengthOfLastWord("Hello World"));
    }

    @Test
    public void testLengthOfLastWord1(){
        LengthOfTheLastWord length = new LengthOfTheLastWord();

        assertEquals(3, length.lengthOfLastWord(" fly  high like a moon pie  "));
    }

}