package sample;

public class ReverseNumberExample {

	public static void main(String[] args) {
		
		int number = 12345, reverse = 0, digit;
		
		System.out.println("Original Number : "+number);
		for(;number!=0;number/=10)
		{
			digit = number % 10;
			reverse = reverse * 10 + digit;
		}
		
		System.out.println("Reversed Number : "+reverse);

	}

}
