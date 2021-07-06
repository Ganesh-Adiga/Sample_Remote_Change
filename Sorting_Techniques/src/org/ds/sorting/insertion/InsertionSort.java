package org.ds.sorting.insertion;

public class InsertionSort {
	
	public int[] sort(int[] inputArray){
		
		for (int i=1;i<inputArray.length;i++){
			
			int valueAtReference = inputArray[i];
			int j = i;
			
			while (j>0 && valueAtReference < inputArray[j-1]){
				
				inputArray[j] = inputArray[j-1];
				j--;
			}
			
			inputArray[j] = valueAtReference;	
		}
		
		
		return inputArray;
	}

}
