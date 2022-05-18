package trial;

public class StringExample5 {
	public static void main(String args[])
	{
		String str = "India is my country";
		removeChar (str,'g');
	}

	private static void removeChar(String str, char c) {
		int j, count = 0, n = str.length();
		char t[] = str.toCharArray();
		for (int i=j=0; i<n;i++)
		{
			if(t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}
		while(count>0)
		{
			t[j++]='\0';
			count--;
		}
		System.out.println(t);
		
	}

}
