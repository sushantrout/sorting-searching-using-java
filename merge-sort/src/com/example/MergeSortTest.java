package com.example;

import java.util.Arrays;

public class MergeSortTest {
	public static void main(String[] args) {
		int array[] = { 3, 1, 5, 7, 2, 4, 6, 0 };

		System.out.println(Arrays.toString(array));
		mergeSort(array, array.length);
	}

	private static void mergeSort(int[] array, int length) {
		if (length < 2) {
			return;
		}
		int mid = length / 2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[length - mid];

		for (int i = 0; i < mid; i++) {
			leftArray[i] = array[i];
		}
		for (int i = mid; i < length; i++) {
			rightArray[i - mid] = array[i];
		}
		mergeSort(leftArray, mid);
		mergeSort(rightArray, length - mid);

		merge(array, leftArray, rightArray, mid, length - mid);

	}

	private static void merge(int[] array, int[] leftArray, int[] rightArray, int mid, int size) {
		int i = 0, j = 0, k = 0;

		while (i < mid && j < size) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			} else {
				array[k++] = rightArray[j++];
			}
		}

		while (i < mid) {
			array[k++] = leftArray[i++];
		}
		while (j < size) {
			array[k++] = rightArray[j++];
		}
	}
}
