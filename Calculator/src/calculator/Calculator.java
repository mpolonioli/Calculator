package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	
	private static Map<String, Operation> operations = new HashMap<>();

	public Calculator(){
		// Inizialize operations
		Plus plus = new Plus();
		Minus minus = new Minus();
		// Put operations in hashmap
		operations.put("+", plus);
		operations.put("-", minus);
	}
	
	public int calculate(String operator, int operand_1, int operand_2){
		return operations.get(operator).calculate(operand_1, operand_2);
	}
}