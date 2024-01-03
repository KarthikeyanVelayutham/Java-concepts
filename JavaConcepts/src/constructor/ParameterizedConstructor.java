package constructor;

public class ParameterizedConstructor {
	
	String cricketerName ;
	int jerseyNumber;
	
	ParameterizedConstructor(String name,int number){
		cricketerName = name;
		jerseyNumber = number;
	}
	
	public void cricketerInfo() {
		System.out.println("cricketer name is " + cricketerName + " and his jersey number is " + jerseyNumber);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor cricketer = new ParameterizedConstructor("dhoni", 7);
		cricketer.cricketerInfo();
		
		ParameterizedConstructor cricketer2 = new ParameterizedConstructor("sachin Tendulkar", 10);
		cricketer2.cricketerInfo();
	}

}
