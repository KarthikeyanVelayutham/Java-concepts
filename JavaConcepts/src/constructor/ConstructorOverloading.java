package constructor;

public class ConstructorOverloading {
	
	String HighestPaidPlayer;
	
	ConstructorOverloading(){
		System.out.println("The auction price starts from 20 lakhs");
	}
	
	ConstructorOverloading(String name){
		HighestPaidPlayer = name;
		System.out.println("From 20 lakhs pool " + name + " is the highest paid player");
	}

	public static void main(String[] args) {
		ConstructorOverloading player = new ConstructorOverloading();
		ConstructorOverloading playerinfo = new ConstructorOverloading("Rinku singh");
	}

}
