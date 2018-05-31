package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void testGetFactorial5() {
		int number = 5;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(120, result);
	}
	
	@Test
	public void testGetFactorial7() {
		int number = 7;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(5040, result);
	}

	@Test
	public void testGetFactorial10() {
		int number = 10;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(3628800, result);
	}
	
	@Test
	public void testGetFactorial1() {
		int number = 1;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(1, result);
	}
	
	@Test
	public void testGetFactorial0() {
		int number = 0;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(0, result);
	}
	
	@Test
	public void testGetFactorialMinus1() {
		int number = -1;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(0, result);
	}
	
	@Test
	public void testGetFactorial12() {
		int number = 12;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(479001600, result);
	}
	
	@Test
	public void testGetFactorial13() {
		int number = 13;
		Factorial factorial = new Factorial();
		int result = factorial.getFactorial(number);
		assertEquals(0, result);
	}
}
