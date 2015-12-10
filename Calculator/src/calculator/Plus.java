package calculator;

public class Plus implements Operation {

	public static Operation plus = new Plus();
	
	@Override
	public int calculate(int operand_1, int operand_2) {
		return operand_1 + operand_2;
	}
}
