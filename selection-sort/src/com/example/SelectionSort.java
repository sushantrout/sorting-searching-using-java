package com.example;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 7, 2, 4, 6, 0 };

		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			int smallIndex = i;
			int current = array[i];
			for (int j = i; j < array.length; j++) {
				if (array[smallIndex] > array[j]) {
					smallIndex = j;
				}
			}

			int temp = array[smallIndex];
			array[smallIndex] = current;
			array[i] = temp;
		}

		System.out.println(Arrays.toString(array));
	}
}
