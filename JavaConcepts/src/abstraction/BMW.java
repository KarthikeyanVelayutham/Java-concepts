package abstraction;

public class BMW extends Car {
	
	public void engineSecret() {
		System.out.println("BMW engine secret");
	}
	
	public void companyValut() {
		System.out.println("BMW company vault");
	}

	public static void main(String[] args) {
		Car car = new BMW();
		car.companyValut();
		car.engineSecret();
		owner();
		

	}

}
