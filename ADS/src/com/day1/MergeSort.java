package com.day1;

import java.util.Arrays;

public class MergeSort {

	static int[] mergeSort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}

		int mid = arr.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);

	}

	private static int[] merge(int[] first, int[] second) {

		int[] mix = new int[first.length + second.length];

		int i = 0; // to track index of first
		int j = 0; // to track index of second
		int k = 0; // to track index of mix

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			} else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}

		// It may be possible one of the array is not completed
		// Copy the the remaining element

		while (i < first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}

		while (j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}

		return mix;
	}

	static void mergeSortInplace(int[] arr, int s, int e) {
		if (e - s == 1) {
			return;
		}

		int mid = (s + e) / 2;
		mergeSortInplace(arr, s, mid);
		mergeSortInplace(arr, mid, e);

		merge(arr, s, mid, e);

	}

	private static void merge(int[] arr, int s, int m, int e) {

		int[] mix = new int[e - s];

		int i = s; // to track index of first
		int j = m; // to track index of second
		int k = 0; // to track index of mix

		while (i < m && j < e) {
			if (arr[i] < arr[j]) {
				mix[k] = arr[i];
				i++;
			} else {
				mix[k] = arr[j];
				j++;
			}
			k++;
		}

		// It may be possible one of the array is not completed
		// Copy the the remaining element

		while (i < m) {
			mix[k] = arr[i];
			i++;
			k++;
		}

		while (j < e) {
			mix[k] = arr[j];
			j++;
			k++;
		}
		for (int l = 0; l < mix.length; l++) {
			arr[s + l] = mix[l];
		}

	}

	public static void main(String[] args) {
		int arr[] = { 5, 6, 4, 3, 7, 8, 3, 2, 1 };
//		int[] mergeSort = mergeSort(arr);
		
		mergeSortInplace(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
