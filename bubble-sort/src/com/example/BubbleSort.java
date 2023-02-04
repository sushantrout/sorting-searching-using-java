package com.example;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 7, 2, 4, 6, 0 };

		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}
}
