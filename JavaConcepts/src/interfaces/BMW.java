package interfaces;

public class BMW  implements Car{
	
	public void engineSecret() {
		System.out.println("BMW engine secrets");
	}
	
	public void companyValut() {
		System.out.println("BMW company vaults");
	}

	public static void main(String[] args) {
		Car car = new BMW();
		car.companyValut();
		car.engineSecret();
		

	}
}
