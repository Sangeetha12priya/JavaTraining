package sample;
import java.util.Scanner;
public class SumOfDigits {
	int input,sum=0;
	void getinput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input: ");
		input=scan.nextInt();
		scan.close();
	}
	void sumDigits()
	{
		while (input!=0)
		{
			sum=sum+input%10;
			input=input/10;
			
		}
		System.out.println("Sum of each digits: "+sum);
	}

}
