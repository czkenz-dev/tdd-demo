package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    void calculateValid() {
        int num1 = 3;
        int num2 = 4;
        int expectResult = num1 * num2;
        assertEquals(12, expectResult);
    }

    @Test
    void calculateValid2() {
        int num1 = 5;
        int num2 = 4;
        int expectResult = num1 * num2;
        assertEquals(20, expectResult);
    }

    @Test
    void calculateInvalid() {
        int num1 = 3;
        int num2 = 4;
        int expectResult = num1 * num2;
        assertNotEquals(15, expectResult);
    }

}
