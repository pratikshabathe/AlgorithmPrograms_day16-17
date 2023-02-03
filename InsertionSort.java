package com.bridgelabz.algorithm_problem;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[j];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr[] = new int [] { 2, 6, 5, 1, 3, };
		arr = insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
