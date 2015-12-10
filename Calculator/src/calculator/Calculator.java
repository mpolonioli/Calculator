package calculator;

public class Calculator {

	public Calculator(){
		this.initHashMap();
	}
	
	private void initHashMap(){
		OperationHashMap.operation.put("+", Plus.plus);
	}
}
