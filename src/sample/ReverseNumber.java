package sample;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234, reversedNumber =0,remainder;
		
		System.out.println("Original Number:" +number);
		
		while(number!=0)
		{
			remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number / 10;
		}
		
		System.out.println("Reversed Number : "+ reversedNumber);

	}
}
