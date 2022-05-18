package SetExample;
import java.util.*;

class SetAddRemoveExmaple {
	Scanner scan = new Scanner(System.in);
	
	Set<String> addSetElements()
	{
		Set <String> set = new LinkedHashSet <String>();
		int number=0;
		try {
			System.out.println("Enter the number of set elements :");
			number = scan.nextInt();
		}catch(InputMismatchException ime) {System.out.println("Input mismatch exception");}
		
		for(int count=1; count <= number; count++)
		{
			set.add(scan.next());
		}
		System.out.println("Set Elements:"+set);
		
		return set;
	}
	
	void removeElements(Set <String> set)
	{
		set.remove("Lion");
		set.remove("Cow");
		System.out.println("Removed Set Elements :"+set);
		
	}
	ArrayList<String> removeAllElements (Set <String> set)
	{
		ArrayList <String> array = new ArrayList<String>();
		array.add("Tiger");
		array.add("Lion");
		array.add("Leopard");
		//System.out.println("Set elements :"+set);
		System.out.println("Array elements :"+array);
		set.removeAll(array);
		System.out.println("After removeAll method :"+set);
		
		return array;
		
	}
	
}
