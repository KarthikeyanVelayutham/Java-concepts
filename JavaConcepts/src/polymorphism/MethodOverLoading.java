package polymorphism;

class Parent{
	
}
class Friend{
	
}

class Son{
	
}

public class MethodOverLoading {
	public void talk(Parent styleOfTalking) {
		System.out.println("speak respectfully");
	}
	
    public void talk(Friend styleOfTalking) {
		System.out.println("speak friendly");
	}

    public void talk(Son styleOfTalking) {
	    System.out.println("speak strictly");
    }
    
    public static void main(String[] args) {
    	MethodOverLoading a = new MethodOverLoading();
    	Friend friend = new Friend();
    	a.talk(friend);
    	
    	Son son = new Son();
    	a.talk(son);
    }
	

	
	

}
