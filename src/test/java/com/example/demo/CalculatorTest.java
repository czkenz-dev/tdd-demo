package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void calculateValid() {
		int num1 = 3;
		int num2 = 4;
		int expectResult = num1 * num2;
		assertEquals(12, expectResult);
	}

	@Test
	void calculateInvalid() {
		int num1 = 3;
		int num2 = 4;
		int expectResult = num1 * num2;
		assertNotEquals(15, expectResult);
	}

}
