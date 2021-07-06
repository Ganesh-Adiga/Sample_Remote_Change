package org.ds.sorting.insertion;

public class InsrtionSortTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputArray = new int [] {10,9,4,7,8,3,1,2};
		int [] outputArray = new InsertionSort().sort(inputArray);		
		for (int i : outputArray) {
			System.out.println(i);
		}

	}

}
