package strings;

public class StringMethods {

	public static void main(String[] args) {
		//charsequence(interface) method
		// TODO Auto-generated method stub
		
		String name = " karthikeyan ";
		
		//return charcter value of the particular index*******
		System.out.println(name.charAt(2));       
		
		//return string length*****************
		System.out.println(name.length());
		
		//check the equality of the string
		System.out.println(name.equals("karthikeyan"));
		
		//check the equality of the string with the given string object without case sensitivity
		System.out.println(name.equalsIgnoreCase("KARTHIKEYAN"));
		
		//check wheter the string is empty or not
		System.out.println(name.isEmpty());
		
		//return true or false based on the given value is present or not
		System.out.println(name.contains("karthik"));
		
		//to take a particular portion of a string ----> start from************
		System.out.println(name.substring(3));
		
		//to take a particular portion of a string-----> begin and end index
		System.out.println(name.substring(0, 7));  //endvalue value-1 as index
		
		//to append the string to the given string***********
		System.out.println(name.concat(" subramanian"));
		
		//replace the existing char with a given char**********************
		System.out.println(name.replace("a", "e"));
		System.out.println(name.replace("eyan", "subramanian"));
		
		//to find the position of character in a string********************
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('a' , 2));
		
		//to trim the string ---> it will trim the spaces
		System.out.println(name.trim());
		
		//convert a datatype to string
		int number = 3;
		System.out.println(String.valueOf(number));
		
		//toUppercase
		String names = "KARTHIK";
		System.out.println(names.toLowerCase());
		//toLowerCase
		System.out.println(name.toUpperCase());
		
		//to split*********************************************
		String splitThis = "Will ,I ,Get ,the ,job";
		String[] str = splitThis.split(",");
		for (String string : str) {
			System.out.print(string);
		}

	}

}
