package com.array;

public class Recursion {

	static void evenNumber(int a, int b) {
		if (b < a) {
			return;
		}

		if (b % 2 == 0) {
			evenNumber(a, b - 2);
		} else {
			evenNumber(a, b - 1);
		}

		if (b % 2 == 0) {
			System.out.print(b + " ");
		}
	}

	static void odd(int a, int b) {
		if (b < a) {
			return;
		}

		if (b % 2 != 0) {
			odd(a, b - 2);
		} else {
			odd(a, b - 1);
		}

		if (b % 2 != 0) {
			System.out.print(b + " ");
		}
	}

	public static void main(String[] args) {
		/*
		 * System.out.print("Even Numbers: "); evenNumber(0, 20);
		 * 
		 * System.out.println();
		 */

		System.out.print("Odd Numbers: ");
		odd(0, 20);

	}

}
