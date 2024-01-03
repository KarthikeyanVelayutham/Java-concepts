package abstraction;

public class BENZ extends Car {
	
	public void engineSecret() {
		System.out.println("BENZ engine secret");
	}
	
	public void companyValut() {
		System.out.println("BENZ company vault");
	}

	public static void main(String[] args) {
		Car car = new BENZ();
		car.companyValut();
		car.engineSecret();
		owner();

	}

}
