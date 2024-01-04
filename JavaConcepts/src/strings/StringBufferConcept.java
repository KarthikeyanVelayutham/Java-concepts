package strings;

public class StringBufferConcept {

	public static void main(String[] args) {
		// to demonstrate string buffer is immutable
		String s1 = "karthik";
		System.out.println(s1.concat("subramanian"));
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("karthi");
		System.out.println(s2.append(" subramanian"));
		System.out.println(s2);
		
		
		//stringBufferMethods
		//reverse
		System.out.println(s2.reverse());
		
		//insert
		StringBuffer insert = new StringBuffer("karthik");
		System.out.println(insert.insert(6, 'c'));

			
		//replace
		StringBuffer replace = new StringBuffer("karthi");
		System.out.println(replace.replace(0, 3, "par"));
		
		
		//delete
		StringBuffer delete = new StringBuffer("karthi");
		System.out.println(delete.delete(4, 5));
		
		//capacity - it will tell how much character that we can store
		System.out.println(insert.capacity());
		System.out.println(delete.capacity());
		
		
	}

}
