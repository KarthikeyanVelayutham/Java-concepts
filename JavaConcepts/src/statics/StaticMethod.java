package statics;

public class StaticMethod {
	
	public static void method1() {
		System.out.println("Hi i am static 1");
	}
	
	public void method2() {
		method1();
		System.out.println("Hi i am non static method 1");
	}

	public static void main(String[] args) {
		method1();
		
		StaticMethod nonStaticMethod = new StaticMethod();
		nonStaticMethod.method2();
	}

}
