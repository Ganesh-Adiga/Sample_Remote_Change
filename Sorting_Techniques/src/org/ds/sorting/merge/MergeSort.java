package org.ds.sorting.merge;

public class MergeSort {

	private int [] inputArr;

	public int [] performSorting(int [] inputArr){
		this.inputArr = inputArr;
		int low = 0;
		int high = inputArr.length-1;
		sort(low,high);
		return inputArr;
	}



	public void sort(int low, int high ){	
		if(low<high){
			int mid = (high+low)/2;				
			sort(low , mid);
			sort (mid+1,high);
			merge(low,mid,high);
		}
	}

	public void merge(int low, int mid, int high)
	{
		int [] tempArray = new int [high-low+1];
		int i = low;
		int j= mid+1;
		int k=0;
		while(i<=mid && j<=high){
			if(inputArr[i] > inputArr[j]){
				tempArray[k] = inputArr[j];
				k++;
				j++;

			}
			else{
				tempArray[k] = inputArr[i];
				k++;
				i++;	
			}
		}
		if(i>mid){
			while(j<=high){
				tempArray[k] = inputArr[j];
				j++;
				k++;
			}
		}
		if(j>high){
			while(i<=mid){
				tempArray[k] = inputArr[i];
				i++;
				k++;
			}
		}
		int pointer = low;
		for (int val : tempArray) {
			inputArr[pointer] = val;
			pointer++;
		}
	}
}
