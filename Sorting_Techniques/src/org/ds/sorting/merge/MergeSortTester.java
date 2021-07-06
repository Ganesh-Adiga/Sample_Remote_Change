package org.ds.sorting.merge;


public class MergeSortTester {

	public static void main(String[] args) {
		int [] inputArray = new int [] {11,12,13,1};
		int [] outputArray = new MergeSort().performSorting(inputArray);		
		for (int i : outputArray) {
			System.out.println(i);
		}
	}

}
