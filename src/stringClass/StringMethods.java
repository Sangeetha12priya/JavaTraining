package stringClass;
import java.util.Scanner;
public class StringMethods {
	
	//String Methods:
		public static void main(String args[])
	{
	String name;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the String :");
	name = scan.next();
	scan.close();
	
	System.out.println(name.charAt(1)); 
	System.out.println(name.length()); 
	System.out.println(name.equals("priya"));
	System.out.println(name.equalsIgnoreCase("priya"));
	System.out.println(name.isEmpty()); // checks if string is empty or not.
	System.out.println(name.contains("a")); //returns true or false based on the given value is present or not.
	System.out.println(name.substring(1)); // take a particular portion of the string.
	System.out.println(name.substring(1,3)); // take a particular portion of the string begin and end index.
	System.out.println(name.concat("priya"));  //appends the string to the given string
	System.out.println(name.replace("P", "p"));
	System.out.println(name.replace("Priya", "geetha")); // replaces the existing char with given char
	System.out.println(name.indexOf("P")); //find the position of character in the string
	System.out.println(name.indexOf("a", 4)); //find the position character specified form the index position.
	System.out.println(name.indexOf("riya", 1));
	System.out.println(name.trim()); // trim will remove the white spaces before and after
	System.out.println(String.valueOf(93));  // convert the given data type to string
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(String.join(name,"kulasekaran","12-april"));	//Returns a joine string with given delimiter
	
	/*Split
	String splitThis=”Am,I,teaching,good?”;
	String [] splittedWords=splitThis.split(“,”);
	for(String string: splittedWords)
	{
	System.out.println(string);
	}*/
	
	}
}



