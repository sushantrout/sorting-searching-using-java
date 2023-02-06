package com.example;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int array[] = { 3, 1, 5, 7, 2, 4, 6, 0 };

		System.out.println(Arrays.toString(array));
		int length = array.length;

		for (int i = 1; i < length; i++) {
			int key = array[i];

			int j = i - 1;
			while (j > -1 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

		System.out.println(Arrays.toString(array));
	}
}
