package stringClass;

public class StringPalindrom {
	
	public String reverse (String str)
	{
		if(str.length() < 2)
		{
			return str;
		}
		return reverse (str.substring(1))+str.charAt(0);
	}
	
	public boolean checkPalindrom (String str)
	{
		String reverse = reverse (str);
		
		if(str.equals(reverse))
		{
			return true;
		}
		return false;
	}

}
