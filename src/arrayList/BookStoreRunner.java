package arrayList;

public class BookStoreRunner {

	public static void main(String[] args) {
		
		OrderProcessor oOrderProcessor = new OrderProcessor();
		oOrderProcessor.printOrderDetails(oOrderProcessor.getOrderFromTheCustomer());

	}

}
