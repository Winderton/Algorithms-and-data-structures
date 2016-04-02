package com.winderton.algorithms.selectionSort;

public class SelectionSort {
	
	//4,2,3,1
	//1,2,3,4

	public static int[] selectionSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int smallestValue = a[i];
			int smallestIndex = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < smallestValue) {
					smallestValue = a[j];
					smallestIndex = j;
				}
			}
			
			if (smallestValue < a[i]) {
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
		return a;
	}
	
	public static void main(String...args) {
		int a[] = {4,2,3,1,4,6,3,5,7,3,5,1,4,56,52323,1};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		selectionSort(a);
		for (int i = 0 ; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
