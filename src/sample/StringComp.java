package sample;
import java.util.Scanner;

public class StringComp {
	
	String input1,input2;
	Scanner scan = new Scanner(System.in);
	
	public void getString()
	{
		System.out.println("Enter the input1 :");
		input1 = scan.nextLine();
		System.out.println("Enter the input2 :");
		input2 = scan.nextLine();
		
	}
	public void operation()
	{
		if(input1.length()>input2.length())
		{
			System.out.println(input1 + " Greater than " + input2);
			System.out.println("Input1 is greater than input2 by character count :"+(input1.length()-input2.length()));
		}
		if(input1.length()==input2.length())
		{
			System.out.println(input1 + " equals to " +input2);
		}
		else
		{
			System.out.println(input2 + " Greater than " + input1);
			System.out.println("Input2 is greater than input1 by character count :"+(input2.length()-input1.length()));
		}
		System.out.println("Input1 count: "+input1.length());
		System.out.println("Input2 count: "+input2.length());
	}

}
