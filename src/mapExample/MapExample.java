package mapExample;

import java.util.*;

public class MapExample {
	
	
	void hashMap()
	{
		Map <Integer,String> map = new HashMap <Integer,String>();
		map.put(2047,"Priya");
		map.put(3208,"Sangeetha");
		map.put(2832,"Geetha");
		map.put(1923,"Sudha");
		map.put(2367,"Sanjana");
		Set<Integer> set = map.keySet();
		
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            System.out.println(key + " "+ map.get(key));
        }
        
        HashMap <Integer,String> duplicateMap = new HashMap<Integer, String>();
        duplicateMap.putAll(map);
        System.out.println("Duplication of Map:"+duplicateMap);
        
        duplicateMap.clear();
        System.out.println("After clear :"+duplicateMap);
        
        System.out.println("Given Key vaule present:"+map.containsKey(2047));
        
        System.out.println("Given Vaule present :"+map.containsValue("Priya"));
        
      	System.out.println("Check Generic value is empty or not :"+map.isEmpty());
	}

	void linkedHashMap()
	{
		Map <Integer,String> map = new LinkedHashMap <Integer,String>();
		map.put(2047,"Priya");
		map.put(3208,"Sangeetha");
		map.put(2832,"Geetha");
		map.put(1923,"Sudha");
		map.put(2367,"Sanjana");
		System.out.println("Linked Hash Map values:"+map);
	}
	
	void treeMap()
	{
		Map <Integer,String> map = new TreeMap <Integer,String>();
		try {
			map.put(2047,"Priya");
			map.put(3208,"Sangeetha");
			map.put(2832,"Geetha");
			map.put(1923,"Sudha");
			map.put(2367,"Sanjana");
			map.put(null,"Kural");
		
		}catch(NullPointerException npe) {
			System.out.println("Tree Map does not allow NULL keys");
		}
		for(@SuppressWarnings("rawtypes") Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}
		System.out.println();
		
        NavigableMap<Integer,String> dmap = ((TreeMap<Integer,String>) map).descendingMap();
        
        System.out.println("Reverse navigable map values: " + dmap);
	
	}

}
