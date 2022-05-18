package trial;

public class StringExample {
	
	public String minCat(String st1, String st2) 
	{
	  if (st1.length() == st2.length())
	    return st1+st2;
	  if (st1.length() > st2.length())
	  {
	    int diff = st1.length() - st2.length();
	    return st1.substring(diff, st1.length()) + st2;
	  } else 
	  {
	    int diff = st2.length() - st1.length();
	    return st1 + st2.substring(diff, st2.length());
	  }
	}
	public static void main (String[] args)
	    {
	      StringExample oStringExample= new StringExample();
	      String str1 =  "Welcome";
		  String str2 =  "home";
		  
	      System.out.println("The given strings is: "+str1+" and "+str2);
	      System.out.println("The new string is: "+oStringExample.minCat(str1,str2));
		  }
}
