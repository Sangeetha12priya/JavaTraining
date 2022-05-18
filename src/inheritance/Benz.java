package inheritance;

class Benz extends Maruti {
	
	public Benz()
	{
		System.out.println("This is Class Benz");
	}
	
	public void speed()
	{
		super.speed();
		System.out.println("Maximum Speed : 100kmph ");
	}

}
