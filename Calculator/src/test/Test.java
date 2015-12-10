package test;

import calculator.Calculator;

public class Test {
	
	private Calculator calculator = new Calculator();

	@org.junit.Test
	public void testPlus() {
		assert(calculator.calculate("+", 1, 1) == 2);
	}

}
