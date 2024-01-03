package oneMainFunctionAndOneUserDefinedFunction;

public class BankAccount {
	
	
	Long accounNumber = 123456789l;
	String accountHolderName = "karthikeyan";
	Integer accountBalance = 884;
	
	public void getBalance() {
		System.out.println("Account balance is " + accountBalance);
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.getBalance();
	}

}
