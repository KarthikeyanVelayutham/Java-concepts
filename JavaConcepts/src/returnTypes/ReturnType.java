package returnTypes;

public class ReturnType {

	Integer collectedAmount = 2000;
	
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Dad i have collected rupees " + collectedAmount + " and send it to you ");
		return collectedAmount;
	}
	
	
	public static void main(String[] args) {
		ReturnType mySon = new ReturnType();
		Integer amount = mySon.collectAmountAndGiveItToMe();
		System.out.println("son i have got the " + amount);
	}
}
