package trial;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {
	DataStorage oDataStorage = new DataStorage();
		
	void getTheArrayElements(){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the length of array:");
		oDataStorage.setLengthOfTheArray(scan.nextInt());
		System.out.println("Enter the Array Elements :");
		
		int array[] = new int[oDataStorage.getLengthOfTheArray()];//int array[5]
		
		for(int index = 0;index < oDataStorage.getLengthOfTheArray();index++ )
		{
			array[index]=scan.nextInt();//[90,20,50,80]
				}
		oDataStorage.setUnSortedArray(array);
		scan.close();
		
		System.out.println("Length of Array :"+oDataStorage.getLengthOfTheArray());
		int array1[] = oDataStorage.getUnSortedArray();
		System.out.print("Unsorted array :");
		for(int iterator =0;iterator < array1.length;iterator++)
			System.out.print(array1[iterator]+ " ");
		
	}
	
	void sortTheArrayInAscendingOrder() {
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		for(int count1 = 1;count1 < unSortedArray.length;count1++) {
			for (int count2 = 0;count2 < unSortedArray.length;count2++) {
				int temp = 0;
				if (unSortedArray[count1] < unSortedArray[count2])
				{
					temp = unSortedArray[count1];//20
					unSortedArray[count1] = unSortedArray[count2];//90[20 90 50 80]
					unSortedArray[count2] = temp;//20
				}
			}
			
		}
		oDataStorage.setArraySortedInAscendingOrder(unSortedArray); 
		   	}
	
	void sortTheArrayInDescendingOrder() {
		int unSortedArray[] = oDataStorage.getArraySortedInAscendingOrder();
		for(int count1 = 0;count1 < unSortedArray.length;count1++) {
			for (int count2 = 0;count2 < unSortedArray.length;count2++) {
				int temp = 0;
				if (unSortedArray[count2] < unSortedArray[count1])
				{
					temp = unSortedArray[count1];
					unSortedArray[count1] = unSortedArray[count2];
					unSortedArray[count2] = temp;
				}
			}
			
		}
		oDataStorage.setArraySortedInDescendingOrder(unSortedArray);
		
	   	}
	
	void displayTheArraySortedInAscendingOrder() {
		int array1[] = oDataStorage.getArraySortedInAscendingOrder();
		System.out.print("\nAscending Order :");
		for(int iterator =0;iterator < array1.length;iterator++)
			System.out.print(array1[iterator]+ " ");
			}
	
	void displayTheArraySortedInDescendingOrder() {
		int array1[] = oDataStorage.getArraySortedInDescendingOrder();
		System.out.print("\nDescending Order :");
		for(int iterator =0;iterator < array1.length;iterator++)
			System.out.print(array1[iterator]+ " ");
			}

}
