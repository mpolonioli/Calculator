package test;

import junit.framework.TestCase;

import calculator.Calculator;

public class Test extends TestCase{
	
	private Calculator calculator = new Calculator();

	@org.junit.Test
	public void testPlus() {
		assertTrue(calculator.calculate("+", 1, 1) == 2);
	}
}
