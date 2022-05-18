package sample;

public class ArmstrongExample2 {
	int num1 = 0, num2 =500;
	//int iterate = 153;
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
		
		ArmstrongExample2 oArmstrongExample2 = new ArmstrongExample2();
		oArmstrongExample2.operation();

	}
}
