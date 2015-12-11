package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	private static Map<String, Operation> operations = new HashMap<>();

	public Calculator(){
		operations.put("+", Plus.getInstance());
		operations.put("-", Minus.getInstance());
	}
	
	public int calculate(String operator, int operand_1, int operand_2){
		return operations.get(operator).calculate(operand_1, operand_2);
	}
}