package stringClass;
import java.util.Scanner;

public class ReverseStringRunner {
	
	public static void main (String args[])
	{
		ReverseString oReverseString = new ReverseString();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: "); 
		String str = scan.nextLine();
		scan.close();
		System.out.println("Original String :"+str);
		/*
		String reverseStr = new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String using StringBuffer :" +reverseStr);
		
		reverseStr = oReverseString.reverse(str);
		System.out.println("Reverse String using Iteration :"+reverseStr);
		*/
		//String reverseStr = oReverseString.reverseRecursively(str);
		System.out.println("Reverse String using Recursion :"+oReverseString.reverseRecursively(str));
		
	}

}
