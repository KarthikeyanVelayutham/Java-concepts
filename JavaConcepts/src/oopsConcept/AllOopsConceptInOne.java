package oopsConcept;


abstract class Building{
	public abstract void firstFloor();
	public void secondFloor() {
		System.out.println("Here we will build 3 bedroom house");
	}
	public static void thirdFloor() {
		System.out.println("here we have swimming pool");
	}
    private String builders = "karthik";
	
	public String getBuilders() {
        return builders;
    }
	
	public void setBuilders(String builders) {
		this.builders = builders;
	}
	
} 



public class AllOopsConceptInOne extends Building {
	


	public static void main(String[] args) {
		Building a = new AllOopsConceptInOne();
		a.firstFloor();
		a.secondFloor();
		thirdFloor();
		a.setBuilders("subramanian");
		System.out.println(a.getBuilders());
		
	}
	
	public void firstFloor(){
		System.out.println("Here we will build 2 bedroom house");
	}
	

}