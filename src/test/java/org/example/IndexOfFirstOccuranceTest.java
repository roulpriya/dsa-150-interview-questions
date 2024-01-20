package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfFirstOccuranceTest {

    @Test
    void strStr() {
        IndexOfFirstOccurance indexOfFirstOccurance = new IndexOfFirstOccurance();
        assertEquals(0, indexOfFirstOccurance.strStr("priya", "p"));
        assertEquals(1, indexOfFirstOccurance.strStr("priya", "riya"));
        assertEquals(3, indexOfFirstOccurance.strStr("sadbutsad", "but"));
        assertEquals(-1, indexOfFirstOccurance.strStr("algorithm", "thms"));
        assertEquals(8, indexOfFirstOccurance.strStr("cattbccatcat", "tc"));
        assertEquals(8, indexOfFirstOccurance.strStr("cacatcatcact", "cact"));

    }


}