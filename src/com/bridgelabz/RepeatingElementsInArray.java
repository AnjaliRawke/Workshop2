package com.bridgelabz;

import java.util.Arrays;

public class RepeatingElementsInArray {
	public static void RepeatingElements(int arr[],int n)
	{
		boolean visited[] = new boolean[n];
		Arrays.fill(visited,false);
		for (int i = 0; i < n; i++) {
			if (visited[i] == true)
				continue;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]){
					visited[j] = true;
				count++;
			}
		}
			if(count != 1)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,2,7,8,8,3,3,1};
		int n = arr.length;
		RepeatingElements(arr,n);
	}
}
