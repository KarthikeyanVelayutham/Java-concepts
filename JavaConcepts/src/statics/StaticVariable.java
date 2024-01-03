package statics;

public class StaticVariable {
	
	static int accountNumber = 200;
	String depositBy;
	

	public static void main(String[] args) {
		StaticVariable m1 = new StaticVariable();
		m1.accountNumber=1000;
		m1.depositBy="karthik";
		
		StaticVariable m2 = new StaticVariable();
		m2.accountNumber=20000;
		m2.depositBy="ramesh";
		
		System.out.println("to the account number " + m1.accountNumber + " rupees is deposited by " + m1.depositBy);
		System.out.println("to the account number " + m2.accountNumber + " rupees is deposited by " + m2.depositBy);


	}

}
