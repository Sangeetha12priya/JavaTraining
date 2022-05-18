package sample;

public class ArmstrongNumberWithIntervals {
	int number,digits,sum = 0;
	int checkNumber;
	
	public void operations()
	{
		for(number = 0; number < 500; number++)
		{		
			checkNumber = number;
			
		while (checkNumber != 0)
		{
			digits = checkNumber % 10;
			//digits = digits * digits * digits;
			sum = sum + (digits * digits * digits);
			checkNumber = checkNumber / 10;
		
		}
		if (number == sum)
		{
			System.out.println(number +"Armstrong number");
			}
		}
	}


	public static void main(String[] args) {
		ArmstrongNumberWithIntervals oArmstrongNumberWithIntervals = new ArmstrongNumberWithIntervals();
		oArmstrongNumberWithIntervals.operations();

	}

}
