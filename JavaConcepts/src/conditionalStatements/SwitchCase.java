package conditionalStatements;

public class SwitchCase {
	
	String player = "sachin";
	
	public void cricketPlayerOrNot() {
		switch (player) {
		case "sachin":
			System.out.println(player + " is a cricketer");
			break;
		case "dravid":
			System.out.println(player + " is a cricketer");
			break;
		case "dhoni":
			System.out.println(player + " is a cricketer");
			break;
		
		default:
			System.out.println(player + " is not a cricketer");
		}
	}
	
	

	public static void main(String[] args) {
		SwitchCase check = new SwitchCase();
		check.cricketPlayerOrNot();

	}

}
