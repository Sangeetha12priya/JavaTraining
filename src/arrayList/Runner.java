package arrayList;

import java.util.ArrayList;

	public class Runner {
		public static void main(String[] args) {
			
			
			OrderProcessor1 object = new OrderProcessor1();
			ArrayList<Book>temp = new ArrayList<Book>(object.getOrderFromTheCustomer());
			object.printOrderDetails(temp);
			
			
		}
	}

