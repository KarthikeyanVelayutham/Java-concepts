package inheritance;

class Car {
	
	int wheels = 4;
	static String carColor = "red"; 
	
	public void engine() {
		System.out.println("this is my secret engine ");
	}
}

	public class BMW extends Car {
		public static void main(String[] args) {
			BMW bmw = new BMW();
			System.out.println(bmw.wheels);
			bmw.engine();
			System.out.println(carColor);
		}
		
	}
