package org.ds.sorting.insertion;

public class InsrtionSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputArray = new int [] {1,2,3};
		int [] outputArray = new InsertionSort().sort(inputArray);		
		for (int i : outputArray) {
			System.out.println(i);
		}

	}

}
