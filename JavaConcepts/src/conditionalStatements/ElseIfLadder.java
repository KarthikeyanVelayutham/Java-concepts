package conditionalStatements;

public class ElseIfLadder {
	public void myFavouriteComedian(String favouriteComedian) {
		if (favouriteComedian.equalsIgnoreCase("vadivelu")) {
			System.out.println("favouite comedian award goes to vadivelu ");
		}
		else if (favouriteComedian.equalsIgnoreCase("santhanam")) {
			System.out.println("favouite comedian award goes to santhanam ");
		}
		else {
			System.out.println("Sorry i cant guess");
		}
	}

	public static void main(String[] args) {
		ElseIfLadder comedian = new ElseIfLadder();
		comedian.myFavouriteComedian("santhanam");

	}

}
