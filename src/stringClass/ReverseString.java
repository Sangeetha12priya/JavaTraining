package stringClass;

public class ReverseString {
	
	/* public String reverse (String str)
	{
		StringBuilder strBuilder = new StringBuilder();
		char strChars[] = str.toCharArray();
		
		for (int iteration = strChars.length-1; iteration >= 0; iteration--)
		{
			strBuilder.append(strChars[iteration]);
		}
		return strBuilder.toString();
	}
	*/
	public String reverseRecursively(String str)
	{
		if(str.length() < 2)
		{
			return str;
		}
		return reverseRecursively (str.substring(1))+str.charAt(0);
	}

}
