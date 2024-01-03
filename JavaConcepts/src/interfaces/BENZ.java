package interfaces;


public class BENZ implements Car {
	public void engineSecret() {
		System.out.println("BENZ s class engine secret");
	}
	
	public void companyValut() {
		System.out.println("BENZ s class company vault");
	}

	public static void main(String[] args) {
		Car car = new BENZ();
		car.companyValut();
		car.engineSecret();

	}
}
