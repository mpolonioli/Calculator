package calculator;

public class Minus implements Operation {

	public static Operation minus = new Minus();
	
	@Override
	public int calculate(int operand_1, int operand_2) {
		return operand_1 - operand_2;
	}

}
