package org.ds.sorting.quick;


public class QuickSortTester {

	public static void main(String[] args) {
		int [] inputArray = new int [] {1,2,3,4,5,6};
		int [] outputArray = new QuickSort().perform(inputArray);		
		for (int i : outputArray) {
			System.out.println(i);
		}
	}
}
