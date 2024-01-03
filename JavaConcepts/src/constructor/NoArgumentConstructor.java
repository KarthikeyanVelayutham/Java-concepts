package constructor;

public class NoArgumentConstructor {
	
	int cricketerJersey;
	String cricketerName;

	NoArgumentConstructor(){
		cricketerJersey = 007;
		cricketerName= "Dhoni";
		System.out.println("The best finisher is dhoni");
	}
	
	
	public static void main(String[] args) {
		NoArgumentConstructor cricketer = new NoArgumentConstructor();
		int jersey = cricketer.cricketerJersey;
		System.out.println(jersey);
	}

}
