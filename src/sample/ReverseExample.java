package sample;
import java.util.Scanner;

public class ReverseExample {
	int number,reverseNumber = 0,remainder;
	
	public void getinput()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the input number : ");
		number = scan.nextInt();
		scan.close();
	}
	
	public void operation()
	{
		System.out.println("Given input: "+number);
		while(number != 0)
		{
			remainder = number % 10; 
			reverseNumber = reverseNumber * 10 + remainder; 
			number = number / 10;			
		}
		System.out.println("Reverse of input number : "+reverseNumber);
	}
	

	public static void main(String[] args) {
		ReverseExample oReverseExample = new ReverseExample();
		//oReverseExample.getinput();
		oReverseExample.operation();

	}

}
