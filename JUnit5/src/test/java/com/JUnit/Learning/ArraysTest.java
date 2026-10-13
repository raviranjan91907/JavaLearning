package com.JUnit.Learning;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTest {
    /*
 assertArrayEquals(): is used to check whether two arrays contain the same elements in the same order.

 If both arrays have matching elements at every position, the test passes. Otherwise, the test fails.
  */
    @Test
    void testArray(){
        int []expected={1,2,3,4,9};
        int []actual={9,4,2,1,3};

        Arrays.sort(actual);

        assertArrayEquals(actual,expected);


    }
}
