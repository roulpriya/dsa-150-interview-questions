package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    ContainsDuplicates containsDuplicates = new ContainsDuplicates();

    @Test
    void containsDuplicate() {

        int array[] = {1, 2, 3, 1};
        assertTrue(containsDuplicates.containsDuplicate(array));
    }

    @Test
    void containsDuplicate1() {

        int array[] = { 1, 2, 3, 4};
        assertFalse(containsDuplicates.containsDuplicate(array));
    }
}