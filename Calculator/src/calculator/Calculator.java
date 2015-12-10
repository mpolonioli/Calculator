package calculator;

public class Calculator {

	public Calculator(){
		this.initHashMap();
	}
	
	private void initHashMap(){
		OperationHashMap.operation.put("+", Plus.plus);
	}
	
	public int calculate(String operator, int operand_1, int operand_2){
		return OperationHashMap.operation.get(operator).calculate(operand_1, operand_2);
	}
}
