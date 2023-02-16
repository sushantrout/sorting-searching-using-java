package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * In case of binary search we need a sorted list other wise the binary search
 * will not give right answer.
 * 
 * @author Sushant Kumar Rout
 *
 */
public class BinarySearch {

	public static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12);

		System.out.print("Input search element: ");
		int searchElement = SC.nextInt();

		int position = binarySearch(inputList, 0, inputList.size() - 1, searchElement);
		String foundMessage = position != -1 ? "Yes the search element found  at position " + position + "."
				: "No the given number is not present in the list.";

		System.out.println(foundMessage);
		SC.close();

	}

	public static int binarySearch(List<Integer> inputList, int startIndex, int lastIndex, int searchElement) {
		if (inputList.isEmpty() || startIndex > lastIndex) {
			return -1;
		}

		int mid = (startIndex + lastIndex) / 2;
		if (inputList.get(mid) == searchElement) {
			return mid + 1;
		} else if (inputList.get(mid) < searchElement) {
			return binarySearch(inputList, mid + 1, lastIndex, searchElement);
		} else if(inputList.get(mid) > searchElement){
			return binarySearch(inputList, startIndex, mid -1, searchElement);
		} else {
			return -1;			
		}
	}
}
