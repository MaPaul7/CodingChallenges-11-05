package main;

import java.util.Arrays;

public class ContiguousSubarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {15, 12, 70, 14, 99, 65, 21, 90};
		int[] arr2 = (problem(97, arr1));
		if(arr2 != null) {
			for(int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i]);
				if(i < arr2.length-1) {
					System.out.print(", ");
				}
			}
		}
		else {
			System.out.println("Target could not be reached in the given array");
		}
	}
	public static int[] problem(int target, int[] arr) {
		
		int beg = 0;
		int end = 0;
		int sum = arr[beg];
		if(sum == target) {
			return Arrays.copyOfRange(arr, 0, 1);
		}
		while(sum != target) {
			if(sum < target && end == arr.length-1) {
				return null;
			}
			if(sum < target && end < arr.length) {
				
				end+=1;
				sum+= arr[end];
			}
			if(sum > target) {
				sum-=arr[beg];
				beg++;
			}
			if(sum == target) {
				System.out.println("Starting index: " + beg);
				System.out.println("Ending index: " + end);
				return Arrays.copyOfRange(arr, beg, end + 1);
			}
		}
		return null;
	}
}
