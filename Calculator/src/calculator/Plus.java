package calculator;

public class Plus implements Operation {

	@Override
	public int calculate(int operand_1, int operand_2) {
		return operand_1 + operand_2;
	}
}
