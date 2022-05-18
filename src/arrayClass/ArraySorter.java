package arrayClass;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.NegativeArraySizeException;

public class ArraySorter {
	DataStorage oDataStorage = new DataStorage();
	
	void getTheArrayElements(){
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the length of array:");
		try {
			oDataStorage.setLengthOfTheArray(scan.nextInt());
		}catch(InputMismatchException e) { System.out.println("Check the input data type");}
		catch(NegativeArraySizeException e) {System.out.println(e.getMessage());}
				System.out.println("Enter the Array Elements :");
		int getArrayElements[] = new int[oDataStorage.getLengthOfTheArray()];
		
		try {
			
			for(int iterate = 0;iterate < oDataStorage.getLengthOfTheArray();iterate++ )
				getArrayElements[iterate]=scan.nextInt();
			
		}
		catch(InputMismatchException e) { System.out.println("Verify the given input"); }
		catch(ArrayIndexOutOfBoundsException e) { System.out.println("Check the input");}
		
		oDataStorage.setUnSortedArray(getArrayElements);
		scan.close();
		
		System.out.println("Length of Array :"+oDataStorage.getLengthOfTheArray());
		
		int readArray[] = oDataStorage.getUnSortedArray();
		System.out.print("Unsorted array :");
		for(int iterator =0;iterator < readArray.length;iterator++)
			System.out.print(readArray[iterator]+ " ");
	}
	
	void sortTheArrayInAscendingOrder() {
		
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		
		for(int count1 = 0;count1 < unSortedArray.length;count1++) {
			for (int count2 = 0;count2 < unSortedArray.length;count2++) {
				int tempStore = 0;
				if (unSortedArray[count1] < unSortedArray[count2]){
					tempStore = unSortedArray[count1];
					unSortedArray[count1] = unSortedArray[count2];
					unSortedArray[count2] = tempStore;
				}
			}
    	}
		
		oDataStorage.setArraySortedInAscendingOrder(unSortedArray); 
  	}
	
	void sortTheArrayInDescendingOrder() {
		
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		
		for(int count1 = 0;count1 < unSortedArray.length;count1++) {
			for (int count2 = 0;count2 < unSortedArray.length;count2++) {
				int tempStore = 0;
				if (unSortedArray[count1] > unSortedArray[count2])
				{
					tempStore = unSortedArray[count1];
					unSortedArray[count1] = unSortedArray[count2];
					unSortedArray[count2] = tempStore;
				}
			}
		}
		
		oDataStorage.setArraySortedInDescendingOrder(unSortedArray);
	 }
	
	void displayTheArraySortedInAscendingOrder() {
		
		int arrayAscendingOrder[] = oDataStorage.getArraySortedInAscendingOrder();
		System.out.println();
		System.out.print("\nAscending Order :");
		
		for(int iterator =0;iterator < arrayAscendingOrder.length;iterator++)
			System.out.print(arrayAscendingOrder[iterator]+ " ");
	}
	
	void displayTheArraySortedInDescendingOrder() {
		
		int arrayDescendingOrder[] = oDataStorage.getArraySortedInDescendingOrder();
		System.out.println();
		System.out.print("\nDescending Order :");
		
		for(int iterator =0;iterator < arrayDescendingOrder.length;iterator++)
			System.out.print(arrayDescendingOrder[iterator]+ " ");
	}

}
