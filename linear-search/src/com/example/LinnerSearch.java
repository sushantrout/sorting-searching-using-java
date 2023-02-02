package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Sushant Kumar Rout
 *
 */
public class LinnerSearch {
	public static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 12, 3, 14, 5, 16, 7, 8, 9, 10);
		int position = linearSearch(asList);
		String foundMessage = position != -1 ? "Yes the search element found  at position " + position + "."
				: "No the given number is not present in the list.";

		System.out.println(foundMessage);
		SC.close();
	}

	public static int linearSearch(List<Integer> asList) {
		System.out.print("Input search element: ");
		int searchElement = SC.nextInt();
		int position = 0;
		for (Integer currentValue : asList) {
			position++;
			if (searchElement == currentValue) {
				return position;
			}
		}
		return -1;
	}
}
