package activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity4 {
	
	public static void main(String[] args) {
		
		int[] randomNumbers = {65, 12, 5, -42, 0, 3, -100, 21, 55, 37, -263};
		System.out.println("Array before sorting: " + Arrays.toString(randomNumbers));
		ascendingSort(randomNumbers);
		System.out.println("Array after sorting: " + Arrays.toString(randomNumbers));
	}

	public static void ascendingSort(int[] arr) {
		int size = Array.getLength(arr), i;
		for(i = 1; i<size; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
