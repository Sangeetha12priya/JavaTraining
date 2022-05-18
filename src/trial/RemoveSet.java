package trial;
import java.util.*;

public class RemoveSet {

	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();
		set.add("Rose");
		set.add("Lilly");
		set.add("Jasmine");
		set.add("Hibiscus");
		set.add("Sunflower");
		
		System.out.println("Set elements are"+set);
		
		set.remove("Rose");
		
		System.out.println("Set elements after removal "+set);
		
		set.hashCode();
		System.out.println("The hashcode value is:"+set);
		
		set.clear();
		System.out.println("The final elements are"+set);
		

	}

}
