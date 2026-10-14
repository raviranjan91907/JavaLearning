package com.JUnit.Learning;

import org.junit.jupiter.api.*;
/*
@TestInstance(TestInstance.Lifecycle.PER_CLASS) tells JUnit to create only one object (instance) of the test class for all test methods, instead of creating a separate object for each test method.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceLearning {

    TestInstanceLearning(){
        System.out.println("After using TestInstance annotation this constructor run once");
    }

    /*
    we usually use the static keyword with @BeforeAll and @AfterAll by default. However, when we use @TestInstance(TestInstance.Lifecycle.PER_CLASS), we do not need to use static because JUnit creates only one object of the test class.
     */
    @BeforeAll
    /*static */void initOnce(){
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

    @AfterAll
    /*static */void destroyOnce(){
        System.out.println("After All");
    }

}
