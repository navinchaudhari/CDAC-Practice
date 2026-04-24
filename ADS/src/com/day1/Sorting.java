package com.day1;

import java.util.Arrays;

public class Sorting {

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void selection(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			// Find max item in the remaining array and swap with correct index

			int last = arr.length - i - 1;
			int maxElement = getmaxIndex(arr, 0, last);
			swap(arr, maxElement, last);
		}
	}

	static void selectionSort(int[] arr) {
		// Find min item in the remaining array and swap with correct index

		for (int i = 0; i < arr.length; i++) {

			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			swap(arr, i, minIndex);
		}
	}

	static int getmaxIndex(int[] arr, int start, int end) {
		int max = start;

		for (int i = start; i <= end; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}

	static void bubbleSort(int[] array) {

		boolean swapped = false;

		// run the steps n-1 times
		for (int i = 0; i < array.length; i++) {
			// for each step , max item will come at the last respective index
			for (int j = 1; j < array.length - i; j++) {

				// Swap if the item is smaller than the previous item
				if (array[j] < array[j - 1]) {
					// swap
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					swapped = true;
				}
			}

			// if you did not swap for a particular value of i, it means array is sorted and
			// stop program
			if (!swapped) { // !false will give true
				break;
			}

		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };
		int[] array1 = { 1 };
		int[] array2 = { 5, 4 };
		int[] arrayE = {};
		int[] arrayN = { -89, 25, 56, -3, 2 };
//		int[] array1 = { 1, 2, 3, 4, 5, 6 };

//		System.out.print("Before Swap: " + Arrays.toString(array));

		System.out.println();

		selectionSort(arrayN);

		System.out.print("After Swap: " + Arrays.toString(arrayN));
	}

}
