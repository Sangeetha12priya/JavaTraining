package sample;

public class Singleton {
	
	private static Singleton obj;
	
	void display() {
		System.out.println("This is Singleton program");
	}

		// private constructor to force use of
		// getInstance() to create Singleton object
		private Singleton() {}

		public static Singleton getInstance()
		{
			if (obj==null)
				obj = new Singleton();
			return obj;
		}
		public static void main(String args[])
		{
			Singleton obj = Singleton.getInstance();
			obj.display();
		}
	
}
