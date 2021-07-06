package org.ds.sorting.quick;

public class QuickSort {
	public int [] inputArray;

	public int []  perform(int [] inputArray){
		this.inputArray = inputArray;
		int l = 0;
		int h = inputArray.length-1;
		sort(l, h);	
		return inputArray;
	}


	public void sort(int l, int h ){

		if(l<h){
			int pivot = inputArray[l];

			int i = l;
			int j = h;

			while (i < j){

				while(i<h && inputArray[i] <= pivot){
					i++;
				}
				while(j>l && inputArray[j] >= pivot){
					j--;
				}

				if(i<j){
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}			

			}
			
			int temp = inputArray[j];
			inputArray[j] = inputArray[l];
			inputArray[l] = temp;
			sort(l,j);
			sort (j+1,h);

		}
	}

}
