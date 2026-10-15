package com.JUnit.Learning;

import com.Junit.Learning.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
exception testing means checking whether a method throws the expected exception when something goes wrong.
For example, if a user tries to divide a number by zero, your program might throw an ArithmeticException. In unit testing, we verify that the exception is thrown as expected.


->If the code inside the lambda completes without throwing an exception, the test fails because the expected exception never occurred.

->Also, if it throws an unrelated exception, the test fails.
 */


/*
 Step 1: Call assertThrows()

Step 2: Execute c.divide(10, 0)
The lambda executes the division method.

Step 3: ArithmeticException is thrown
JUnit catches the expected exception and the test passes.


You don't need to write a try-catch block yourself. assertThrows() checks the exception for you.
 */
public class ExceptionTesting {
    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            c.divide(10, 0);
        });
    }
}
/*
 What if we expect no exception?
JUnit 5 also provides assertDoesNotThrow().
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@Test
void testValidDivision() {
    Calculator c = new Calculator();

    assertDoesNotThrow(() -> {
        c.divide(10, 2);
    });
}


This test passes if the operation completes without throwing an exception. It fails if an exception occurs.
 */