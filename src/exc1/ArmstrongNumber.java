package exc1;

public class ArmstrongNumber {
int num1 = 0, num2 =500;
	
	public void operation()
	{
		for( int iterate = num1; iterate<num2; iterate++)
		{
			int check, rem, sum = 0;
			check = iterate;
			
			while ( check != 0)
			{
				rem = check % 10; //1
				sum = sum + (rem * rem * rem); //1
				check = check / 10;
			}
			if (sum == iterate)
			{
				System.out.println(iterate + " is an Armstrong number");
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArmstrongNumber oArmstrongNumber = new ArmstrongNumber();
		oArmstrongNumber.operation();

	}

}
