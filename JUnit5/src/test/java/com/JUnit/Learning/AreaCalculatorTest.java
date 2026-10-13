package com.JUnit.Learning;

import com.Junit.Learning.AreaCalculator;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class AreaCalculatorTest {

    AreaCalculator area=new AreaCalculator();


/*
    assertEqual():->
    In Java JUnit 5, assertEquals() is used to check whether two values are equal. If both values are equal, the test passes. Otherwise, the test fails.
 */
    @Test
    void SquareAreaTest(){
        assertEquals(4,area.squareArea(2),"This is the Test massage");
                                                        //Here there is no lazy evaluation is there
    }

    @Test
    void CircleAreaTest(){
        assertEquals(12.56,area.circleArea(2),()->"This is the Test massage");
                                                            //This is the supplier function interface which will do the lazy evaluation (mean when the test case fails then only this massage is evaluated)
    }


    /*
    assertNotEquals():->
    In Java JUnit 5, assertNotEquals() is used to check that two values are not equal. If the two values are different, the test passes. If they are equal, the test fails.
     */
    @Test
    void rectangleAreaTest(){
//        assertNotEquals(6,area.rectangleArea(2,3));
        //There the tested result and the expected result is same therefore this test is going to faild

        assertNotEquals(6,area.rectangleArea(4,3));
        //There this test is going to pass because the result and the expected result is not equal

    }

    /*
     assertTrue() checks whether a given condition is true. If the condition is false, the test fails.
     */
    @Test
    void CheckingAssertTrue(){
        assertTrue(true);
    }

    /*assertFalse() checks whether a given condition is false. If the condition is true, the test fails.*/
    @Test
    void checkAssertFalse(){
        assertFalse(false);
    }


}
