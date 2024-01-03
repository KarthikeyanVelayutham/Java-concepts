package polymorphism;

public class MethodOverRidingChild extends MethodOverLoadingParent {
	
	@Override
	public void marriage() {
		System.out.println("my life my wish");
	}

	public static void main(String[] args) {
		MethodOverLoadingParent child = new MethodOverRidingChild();
		child.properties();
		child.marriage();
	}

}
