package calculator;

public class Minus implements Operation {
	
	private static Minus operation = null;
	
	protected Minus() {
		
	}
	
	@Override
	public int calculate(int operand_1, int operand_2) {
		return operand_1 - operand_2;
	}

	static public Operation getInstance() {
		if(operation == null) {
			operation = new Minus();
		} 
		return operation;
	}

}
