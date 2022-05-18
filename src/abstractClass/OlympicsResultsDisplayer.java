package abstractClass;

public class OlympicsResultsDisplayer {

	public static void main(String[] args) {
		
		System.out.println("Neerajchopra");
		Athelete oAthelete = new Neerajchopra();
		oAthelete.event();
		oAthelete.accomplisment();
		oAthelete.eat();
		oAthelete.sleep();
		
		System.out.println("\n\nRavikumar");
		oAthelete = new Ravikumar();
		oAthelete.event();
		oAthelete.accomplisment();
		oAthelete.eat();
		oAthelete.sleep();
		
		System.out.println("\n\nPVSindhu");
		oAthelete = new PVSindhu();
		oAthelete.event();
		oAthelete.accomplisment();
		oAthelete.eat();
		oAthelete.sleep();
		

	}

}
