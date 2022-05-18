package trial;
import java.lang.Math;

public class RandomMethod {
	
	public static double random()
	{
		
		return (Math.random() * (15 -10+1)+10);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Generated Random Number :"+RandomMethod.random());
		
}

}
