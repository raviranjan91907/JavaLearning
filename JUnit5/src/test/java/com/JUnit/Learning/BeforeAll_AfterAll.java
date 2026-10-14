package com.JUnit.Learning;

import org.junit.jupiter.api.*;
/*
@BeforeAll and @AfterAll are lifecycle annotations used to execute a method once before and once after all test methods in a test class.

They are useful when you want to perform some setup or cleanup only one time for the entire test class, instead of repeating it for every test.
 */

public class BeforeAll_AfterAll {

    /*
    @BeforeAll tells JUnit 5 to execute a method once before all @Test methods in a test class.
    Common uses:
    - Initialize shared resources.
    - Establish a database connection.
    - Load common test data.
    - Perform expensive setup only once.
     */

    @BeforeAll
    static void initOnce(){
        System.out.println("Before All");
    }

    @BeforeEach
    void initEach(){
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

    @AfterEach
    void destroyEach(){
        System.out.println("After Each");
    }

    /*
    @AfterAll tells JUnit 5 to execute a method once after all @Test methods in a test class have finished.
    Common uses:
    - Close a database connection.
    - Release shared resources.
    - Delete temporary files.
    - Perform final cleanup.
     */
    @AfterAll
    static void destroyOnce(){
        System.out.println("After All");
    }
    /*
    Note:->
        Why do we use static with @BeforeAll and @AfterAll?
        By default, JUnit 5 creates a separate test class instance for each test method. Therefore, @BeforeAll and @AfterAll methods must be static, because they run at the class level rather than on an individual test instance.
     */
}
