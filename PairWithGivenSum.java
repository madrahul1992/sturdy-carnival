package com.quora;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,4,2,-4,-2};
		System.out.println(isZeroSumPair(arr));
	}
	
	static boolean isZeroSumPair(int arr[]) {
		int length = arr.length;
		Set<Integer> set = new HashSet<Integer>();
		set.add(0);
		int sum = 0;
		for(int i = 0; i<length; i++) {
			sum += arr[i];
			System.out.println(sum);
			if(set.contains(sum)) return true;
			else
				set.add(sum);
		}
		return false;
	}
}
