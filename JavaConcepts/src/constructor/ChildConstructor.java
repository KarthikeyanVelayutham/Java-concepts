package constructor;

public class ChildConstructor extends ParentClassConstructor {

	String teamName;
    ChildConstructor() {
    	System.out.println("The auction price starts from 20 lakhs");
    	System.out.println("From 20 lakhs pool rinku singh is the highest paid player");
    }
    
    ChildConstructor(String name){
    	super(name);
    	this.teamName = name;
    	System.out.println("The 2023 champions are " + teamName);
    }
    
    ChildConstructor(String name, long PrizeMoney){
    	super(name,PrizeMoney);
    }

    
    public static void main(String[] args) {
        ChildConstructor c1 = new ChildConstructor();
        ChildConstructor c2 = new ChildConstructor("chennai super kings");
        ChildConstructor c3 = new ChildConstructor("csk" , 200000000L);
    }
}
