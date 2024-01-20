package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        String[] strs = new String[]{"assert", "assersions", "ask"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        assertEquals("as", longestCommonPrefix.longestCommonPrefix(strs));
    }
}