package sample;

class NameLength {
	String name;
	int count;
	NameLength(String name1)
	{
		this.name=name1;
	}
	public void countLength()
	{
		for(int index=0;index<=name.length();index++)
		{
				count++;
		}
		System.out.println("Length of name:"+count);
	}
}
