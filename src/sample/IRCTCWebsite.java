package sample;

public abstract class IRCTCWebsite {
	String name;
	int age;
	public void trainName()
	{
		System.out.println("Rameeswaram Express:");
	}
	public abstract void trainFormPlace();
	public abstract void trainToPlace();
	public abstract void trainDate();
	public void passengerDetails()
	{
		System.out.println("NAME :"+name+"\nAGE :"+age);
	}
	public void passengerDetails(String name,int age)
	{
		System.out.println("NAME :"+name+"\nAGE :"+age);
	}
	
}
