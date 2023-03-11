package com.tech;

public class QuickSortTest {
	public static void main(String[] args) {
		int array[] = { 5, 3, 1, 6, 7, 9, 2, 4, 8 };
		quickSort(array, 0, array.length - 1);
		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(array, low, high);
			quickSort(array, 0, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[low];
		int i = low;
		int j = high;
		while (i < j) {
			while (array[i] <= pivot && i <= high - 1) {
				i++;
			}

			while (array[j] > pivot && j >= low + 1) {
				j--;
			}

			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[low];
		array[low] = array[j];
		array[j] = temp;
		return j;
	}
}
