package com.JUnit.Learning;

import com.Junit.Learning.AreaCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
@BeforeEach and @AfterEach are annotations used to execute some code automatically before and after every test method.

They are useful when you want to prepare the environment before testing and clean it up after testing.
 */
public class BeforeEach_AfterEach {

    /*
    @BeforeEach tells JUnit 5 to execute a method before every @Test method in the test class.
    For example, you can use it to:
    - Initialize variables.
    - Create objects.
    - Set up test data.
    - Prepare the required environment for testing.
     */

    @BeforeEach
    void init(){
        System.out.println("Before Each");
    }

    @Test
    void computeSquareAreaTest(){
        System.out.println("Square Actual Test");
    }

    @Test
    void ComputeCircleAreaTest(){
        System.out.println("Actual Circle Test ");
    }

    /*
    @AfterEach tells JUnit 5 to execute a method after every @Test method in the test class.
    You can use it to:
    - Clear test data.
    - Reset variables or objects.
    - Close resources.
    - Perform cleanup after testing.
     */
    @AfterEach
    void destroy(){
        System.out.println("After Each");
    }
}
