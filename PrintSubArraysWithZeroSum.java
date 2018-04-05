package com.quora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintSubArraysWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,4,-2,-3,-4,2,-2,1,-1};
		printSubArray(arr);
	}
	
	static void printSubArray(int[] arr) {
		int length = arr.length;
		Map<Integer, List<Integer>> map = new HashMap<>();
		insertSubArray(map, 0, -1);
		int sum = 0;
		for(int i=0; i<length;i++) {
			sum+=arr[i];
			if(map.containsKey(sum)) {
				ArrayList<Integer> al = (ArrayList<Integer>) map.get(sum);
				for(int value : al) {
					System.out.println("Sub array is :: "+(value+1)+"...."+i);
				}
			}else {
				insertSubArray(map, sum, i);
			}
		}
	}

	static void insertSubArray(Map<Integer, List<Integer>> map, int key, int value) {
		if(!map.containsKey(key)) {
			map.put(key, new ArrayList<>());
		}
		map.get(key).add(value);
	}
	
}

