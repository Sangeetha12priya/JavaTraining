package sample;

public class ArmstrongExample {

	public static void main(String[] args) {
		
		int number=153,originalNumber,remainder,result=0,count=0;
		originalNumber = number;
		
		for(;originalNumber!=0;originalNumber/=10,++count);
		originalNumber = number;
		
		for(;originalNumber!=0;originalNumber/=10)
		{
			remainder = number % 10;
			result = (int) (result + Math.pow(remainder, count));
		}
		if (result == number)
			System.out.println(number + "is an Armstrong number.");
		else
			System.out.println(number + "is not an Armstrong number");
	}

}
