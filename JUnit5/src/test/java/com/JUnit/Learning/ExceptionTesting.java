package com.JUnit.Learning;

import com.Junit.Learning.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTesting {
    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();

        assertThrows(ArithmeticException.class, () -> {
            c.divide(10, 0);
        });
    }
}
