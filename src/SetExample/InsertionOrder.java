package SetExample;
import java.util.*;
public class InsertionOrder {
	void hashSetInsertion()
	{
		Set <String> hashSet = new HashSet <String>();
		
		hashSet.add("Rose");
		hashSet.add("Lilly");
		hashSet.add("Cherry Blossom");
		hashSet.add("Jasmine");
		hashSet.add("SunFlower");
		System.out.println("Hash Set insertion elements :"+hashSet);
		
	}
	void LinkedHashSetInsertion()
	{
		Set <String> linkedHashSet = new LinkedHashSet <String>();
		
		linkedHashSet.add("Rose");
		linkedHashSet.add("Lilly");
		linkedHashSet.add("Cherry Blossom");
		linkedHashSet.add("Jasmine");
		linkedHashSet.add("SunFlower");
		System.out.println("Linked Hash Set insertion elements :"+linkedHashSet);		
	}
	void treeSetInsertion()
	{
		Set <String> treeSet = new TreeSet <String>();
		
		treeSet.add("Rose");
		treeSet.add("Lilly");
		treeSet.add("Cherry Blossom");
		treeSet.add("Jasmine");
		treeSet.add("SunFlower");
		System.out.println("Tree Set insertion elements :"+treeSet);
		
	}
	

}
