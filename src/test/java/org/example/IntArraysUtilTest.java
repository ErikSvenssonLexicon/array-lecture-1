package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArraysUtilTest {

    @Test
    @DisplayName("[1,2,3,4,5] return expected String")
    void testToString() {
        int[] ints = {1,2,3,4,5};
        String expected= "[1,2,3,4,5]";

        String actual = IntArraysUtil.toString(ints);

        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Successfully added int to array")
    void add() {
        int number = 343;
        int[] source = {1, -3, 7, 2};
        int[] expected = {1, -3, 7, 2, 343};

        int[] actual = IntArraysUtil.add(number, source);

        assertArrayEquals(expected, actual);
    }
}