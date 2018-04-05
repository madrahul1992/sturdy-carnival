package com.quora;

import java.util.Arrays;

public class ReArrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,4,21,34,23,43,56,54};
		reArrangeArray(arr);
	}
	static void reArrangeArray(int[] arr) {
		int length = arr.length;
		Arrays.sort(arr);
		int arr1[] = new int[length];
		int k = 0;
		int i = 0, j = length-1;
		while(i < j) {
			arr1[k++] = arr[i++];
			arr1[k++] = arr[j--];
		}
		
		for(int value: arr1) {
			System.out.println(value);
		}
	}
	
	static void reArrangeArrayWithoutSort(int[] arr) {
		int length = arr.length;
		
	}
}
