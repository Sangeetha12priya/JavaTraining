package stringClass;

public class RemovalOfCharacters {
	
	public void removeCharacters(String str1,String str2)
	{
		char compare;
		String remaining = str1,search,replace="";
		for (int count1 =0;count1 < str1.length();count1++)
		{
			compare = str1.charAt(count1); //i
			search = Character.toString(compare); //i
			
			for (int count2 = 0; count2 < str2.length();count2++)
			{
				if (compare == str2.charAt(count2))
				{
					remaining = remaining.replace(search,replace);
				}
			}
			
		}
		System.out.println("After removing String2 in String1 :"+remaining);
		
	}

}
