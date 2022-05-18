package sample;

public class ArmstrongNumber {
	int number = 153,digits,sum = 0;
	int copyNumber = number;
	
	public void operations()
	{
		while (number != 0)
		{
			digits = number % 10;
			digits = digits * digits * digits;
			sum = digits + sum;
			number = number / 10;
		}
		if (copyNumber == sum)
			System.out.println("Armstrong number");
		else 
			System.out.println("Not Armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumber oArmstrongNumber = new ArmstrongNumber();
		oArmstrongNumber.operations();

	}

}
