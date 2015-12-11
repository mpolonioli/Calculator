package calculator;

public class Plus implements Operation {
	
	private static Plus operation = null;
	
	protected Plus() {
		
	}
	
	@Override
	public int calculate(int operand_1, int operand_2) {
		return operand_1 + operand_2;
	}

	static public Operation getInstance() {
		if(operation == null) {
			operation = new Plus();
		} 
		return operation;
	}

}
