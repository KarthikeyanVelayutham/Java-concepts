package conditionalStatements;

public class IfElseStatementExample {
	boolean isCupEmpty = true;
	
	public static void main(String[] args) {
		IfElseStatementExample coffee = new IfElseStatementExample();
		
		if (coffee.isCupEmpty) {
			System.out.println("fill the cup");
		}
		else {
			System.out.println("drink the coffee");
		}
		
	}
}
