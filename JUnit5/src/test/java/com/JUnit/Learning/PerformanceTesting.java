package com.JUnit.Learning;

import com.Junit.Learning.SortingOfArray;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class PerformanceTesting {

    @Test
    void testSortingMethod_performance(){
        SortingOfArray array=new SortingOfArray();
        int arr[]={1,45,3,5,2};

        assertTimeout(Duration.ofMillis(100),()->array.sortArray(arr));

        /*
        Without Executable

        @Test
        void testTime() throws InterruptedException {
        Thread.sleep(1000);

        assertTimeout(Duration.ofSeconds(2), ???);
        }

        Here, Thread.sleep(1000) executes before assertTimeout() starts checking the code.
        JUnit cannot measure that earlier execution as part of the assertion. We need to give JUnit the code itself so it can execute and measure it.
         */
    }
}
