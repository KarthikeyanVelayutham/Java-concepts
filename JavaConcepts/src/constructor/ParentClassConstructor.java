package constructor;

public class ParentClassConstructor {
	    long winnerPrizeMoney;
	    String name;
	    String names;

	    ParentClassConstructor() {
	    	System.out.println("The auction price starts from 2 crore");
	    	System.out.println("From 2 crore pool dhoni is the highest paid player");
	    }
	    
	    ParentClassConstructor(String names) {
	    	this.names=names;
	    }
	    
	    ParentClassConstructor(String name, long PrizeMoney){
	    	this.winnerPrizeMoney = PrizeMoney;
	    	this.name = name;
	    	System.out.println("The 2023 champions " + name  + " won rupees " + PrizeMoney);
	    }
	    
	}

